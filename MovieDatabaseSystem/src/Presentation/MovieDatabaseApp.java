package Presentation;

import Model.Genre;
import Model.Movie;
import Model.Rating;
import Service.GenreService;
import Service.MovieService;
import Service.RatingService;
import util.DBUtil;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static util.DBUtil.getConnection;

public class MovieDatabaseApp {
    private static Scanner scanner = new Scanner(System.in);
    private static MovieService movieService = new MovieService();
    private static GenreService genreService = new GenreService();
    private static RatingService ratingService = new RatingService();

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            int choice = parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    searchMovie();
                    break;
                case 3:
                    updateMovie();
                    break;
                case 4:
                    deleteMovie();
                    break;
                case 5:
                    displayMovies();
                    break;
                case 6:
                    addGenre();
                    break;
                case 7:
                    displayGenres();
                    break;
                case 8:
                    addRating();
                    break;
                case 9:
                    displayRatings();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("===== MOVIE DATABASE SYSTEM =====");
        System.out.println("1. Add movie");
        System.out.println("2. Search movie");
        System.out.println("3. Update movie");
        System.out.println("4. Delete movie");
        System.out.println("5. Display all movies");
        System.out.println("6. Add genre");
        System.out.println("7. Display all genres");
        System.out.println("8. Add rating");
        System.out.println("9. Display all ratings");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addMovie() {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter movie year: ");
        int year = parseInt(scanner.nextLine());
        System.out.print("Enter genre ID: ");
        int genreId = parseInt(scanner.nextLine());
        System.out.print("Enter rating ID: ");
        int ratingId = parseInt(scanner.nextLine());
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setYear(year);
        movie.setGenreId(genreId);
        movie.setRatingId(ratingId);
        movieService.addMovie(movie);
    }

    private static void searchMovie() {
        System.out.print("Enter movie id to search: ");
        String title = scanner.nextLine();
        Movie movie = movieService.getMovie(Integer.parseInt(title));
        if (movie != null) {
            System.out.println("Movie found: " + movie.getTitle() + ", " +
                    movie.getYear() + ", Genre ID: " + movie.getGenreId() + ", Rating ID: " + movie.getRatingId());
        } else {
            System.out.println("No movie found with that title.");
        }
    }

    private static void updateMovie() {
        System.out.print("Enter movie title to update: ");
        String title = scanner.nextLine();
        System.out.print("Enter field to update (title, year, genre_id, rating_id): ");
        String field = scanner.nextLine();
        System.out.print("Enter new value: ");
        String newValue = scanner.nextLine();
        movieService.updateMovie(title, field, newValue);
    }

    private static void deleteMovie() {
        System.out.print("Enter movie title to delete: ");
        String title = scanner.nextLine();
        movieService.deleteMovie(title);
    }

    private static void displayMovies() {
        movieService.getAllMovies();
    }

    private static void addGenre() {
        System.out.print("Enter genre name: ");
        String name = scanner.nextLine();
        Genre genre = new Genre();
        genre.setName(name);
        genreService.addGenre(genre);
    }

    private static void displayGenres() {

        genreService.getAllGenres();
    }

    private static void addRating() {
        System.out.print("Enter rating value: ");
        float value = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter rating description: ");
        String description = scanner.nextLine();
        Rating rating = new Rating();
        rating.setValue(value);
        rating.setDescription(description);
        ratingService.addRating(rating);
    }

    private static void displayRatings() {

        ratingService.getAllRatings();
    }
}

