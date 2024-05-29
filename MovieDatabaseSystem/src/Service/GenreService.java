package Service;

import DAO.GenreDAO;
import Model.Genre;

import java.util.List;

public class GenreService {
    private GenreDAO genreDAO;

    public GenreService() {
        this.genreDAO = new GenreDAO();
    }

    public void addGenre(Genre genre) {
        genreDAO.addGenre(genre);
    }

    public Genre getGenre(int id) {
        return genreDAO.getGenre(id);
    }

    public void updateGenre(Genre genre) {
        genreDAO.updateGenre(genre);
    }

    public void deleteGenre(int id) {
        genreDAO.deleteGenre(id);
    }

    public void getAllGenres() {
        genreDAO.getAllGenres().forEach(System.out::println);
    }

    public void displayGenres() {
    }
}