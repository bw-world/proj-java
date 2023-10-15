import java.util.Date;
class Accident {
    private static int nextId = 1;
    private int id;
    private String description;
    private Date date;
    public Accident(String description) {
        this.id = nextId++;
        this.description = description;
        this.date = new Date();
    }
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public Date getDate() {
        return date;
    }
}
