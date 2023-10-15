import java.util.ArrayList;
import java.util.List;

class Contract {
    private static int nextId = 1;
    private int id;
    private String name;
    private List<Accident> relatedAccidents;
    public Contract(String name) {
        this.id = nextId++;
        this.name = name;
        relatedAccidents = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}