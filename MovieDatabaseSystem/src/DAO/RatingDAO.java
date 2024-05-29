package DAO;

import Model.Rating;
import util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RatingDAO {
    public void addRating(Rating rating) {
        String sql = "INSERT INTO ratings (value, description) VALUES (?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setFloat(1, rating.getValue());
            stmt.setString(2, rating.getDescription());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Rating getRating(int id) {
        String sql = "SELECT * FROM ratings WHERE id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Rating rating = new Rating();
                rating.setId(rs.getInt("id"));
                rating.setValue(rs.getFloat("value"));
                rating.setDescription(rs.getString("description"));
                return rating;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void updateRating(Rating rating) {
        String sql = "UPDATE ratings SET value = ?, description = ? WHERE id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setFloat(1, rating.getValue());
            stmt.setString(2, rating.getDescription());
            stmt.setInt(3, rating.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteRating(int id) {
        String sql = "DELETE FROM ratings WHERE id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Rating> getAllRatings() {
        List<Rating> ratings = new ArrayList<>();
        String sql = "SELECT * FROM ratings";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Rating rating = new Rating();
                rating.setId(rs.getInt("id"));
                rating.setValue(rs.getFloat("value"));
                rating.setDescription(rs.getString("description"));
                ratings.add(rating);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ratings;
    }
}