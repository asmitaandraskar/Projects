package Model;

public class Rating {
    private int id;
    private float value;
    private String description;

    // Getters and setters
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public float getValue() {

        return value;
    }

    public void setValue(float value) {

        this.value = value;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "id=" + id +
                ", value=" + value +
                ", description='" + description + '\'' +
                '}';
    }
}

