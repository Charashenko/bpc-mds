package cz.vutbr.cv03;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentsWork {
    private List<Student> students;

    public StudentsWork() {
        students = new ArrayList<>();
        students.add(new Student("Číka", "Petr", 10, 1982));
        students.add(new Student("Masaryk", "Tomáš", 123456, 1850));
    }

    @GetMapping("student")
    public String getStudent(@RequestParam(required = false) String name, @RequestParam(required = false) Integer id){
        if(name == null|| id == null) return "Student: <b>My real name, uwu</B> ID: <b>8008135</b>";
        return String.format("Student: <b>%s</b> ID: <b>%s</b>", name, id);
    }

    @GetMapping("students")
    public String getStudents(@RequestParam(required = false) Integer vutid){
        if(vutid == null) {
            StringBuilder sb = new StringBuilder();
            for (Student s:students) {
                sb.append(String.format("Student: <b>%s</b> ID: <b>%s</b><br>", s.getName(), s.getId()));
            }
            return sb.toString();
        }
        Optional<Student> result = students.stream().filter(item -> item.getId() == vutid).findFirst();
        if (result.isEmpty()) return "Neexistuje";
        return String.format(result.get().toString());
    }

}
