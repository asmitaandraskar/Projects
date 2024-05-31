package Service;

import DAO.MovieDAO;
import Model.Movie;

import java.util.List;

public class MovieService {
    private MovieDAO movieDAO;

    public MovieService() {
        this.movieDAO = new MovieDAO();
    }

    public void addMovie(Movie movie) {
        movieDAO.addMovie(movie);
    }

    public Movie getMovie(int id) {
        return movieDAO.getMovie(id);
    }

    public void updateMovie(Movie movie) {
        movieDAO.updateMovie(movie);
    }

    public void deleteMovie(String title) {
        movieDAO.deleteMovie(title);
    }

    public void getAllMovies() {
        movieDAO.getAllMovies().forEach(System.out::println);
    }

    public void updateMovie(String title, String field, String newValue) {
        movieDAO.updateMovieField(title, field, newValue);
    }

    public void displayMovies() {
              }
}
