import java.util.HashMap;

public class MapClass {
    private HashMap<Integer, String> turboMap;

    public MapClass() {
        this.turboMap = new HashMap<>();
    }

    public void store(int id, String value) throws ArrayStoreException {
        if (this.turboMap.containsKey(id)) throw new ArrayStoreException("Map already contains ID");
        this.turboMap.put(id, value);
    }

    public String getValue(int id) throws NoSuchFieldException {
        if (!this.turboMap.containsKey(id)) throw new NoSuchFieldException("Map doesnt contain specified ID");
        return this.turboMap.get(id);
    }

    public void deleteKey(int id) throws NoSuchFieldException {
        if (!this.turboMap.containsKey(id)) throw new NoSuchFieldException("Map doesnt contain specified ID");
        this.turboMap.remove(id);
    }

    public int getSize() {
        return this.turboMap.size();
    }

    public void print() {
        if (this.turboMap.isEmpty()) {
            System.out.println("Map is empty");
            return;
        }
        for (Integer id : this.turboMap.keySet()) {
            System.out.printf("%d -> %s\n", id, this.turboMap.get(id));
        }
    }
}
