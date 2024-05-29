package Model;

public class Movie {
    private int id;
    private String title;
    private int year;
    private int genreId;
    private int ratingId;

    public Movie(int id, String title, int year, int genreId, int ratingId) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genreId = genreId;
        this.ratingId = ratingId;
    }

    public Movie() {
    }

    // Getters and setters
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public int getGenreId() {

        return genreId;
    }

    public void setGenreId(int genreId) {

        this.genreId = genreId;
    }

    public int getRatingId() {

        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", genreId=" + genreId +
                ", ratingId=" + ratingId +
                '}';
    }
}
