package Service;

import DAO.RatingDAO;
import Model.Rating;

import java.util.List;

public class RatingService {
    private RatingDAO ratingDAO;

    public RatingService() {
        this.ratingDAO = new RatingDAO();
    }

    public void addRating(Rating rating) {
        ratingDAO.addRating(rating);
    }

    public Rating getRating(int id) {
        return ratingDAO.getRating(id);
    }

    public void updateRating(Rating rating) {
        ratingDAO.updateRating(rating);
    }

    public void deleteRating(int id) {
        ratingDAO.deleteRating(id);
    }

    public void getAllRatings() {
         ratingDAO.getAllRatings().forEach(System.out::println);
    }

    public void displayRatings() {
    }
}
