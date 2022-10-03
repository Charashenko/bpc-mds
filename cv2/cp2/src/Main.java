public class Main {
    public static void main(String[] args) {
        MapClass turboMap = new MapClass();
        turboMap.store(100, "stovecka");
        turboMap.print();
        System.out.println(turboMap.getSize());
        try {
            turboMap.getValue(10);
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
        try {
            turboMap.deleteKey(10);
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
        try {
            turboMap.deleteKey(100);
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        } finally {
            turboMap.print();
        }
    }
}