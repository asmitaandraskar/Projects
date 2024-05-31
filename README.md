# Projects
Project Overview

Project Name: Movie Database System
Objective: To manage a movie database that allows CRUD operations on movies, genres, and ratings using JDBC in Java.

Architecture
Layered architecture of project:
src/
├── com/
│   └── moviedb/
│       ├── dao/              // Data Access Objects (DAO) for database interactions
│       │   ├── GenreDAO.java
│       │   ├── MovieDAO.java
│       │   └── RatingDAO.java
│       ├── model/            // Model classes representing the database entities
│       │   ├── Genre.java
│       │   ├── Movie.java
│       │   └── Rating.java
│       ├── service/          // Service classes containing business logic
│       │   ├── GenreService.java
│       │   ├── MovieService.java
│       │   └── RatingService.java
│       ├── util/             // Utility classes for common functionality
│       │   └── DBUtil.java
│       └── presentation/     // Presentation layer (main application)
│           └── MovieDatabaseApp.java


1.Model Layer:

Genre.java: Represents the genres entity.
Movie.java: Represents the movies entity.
Rating.java: Represents the ratings entity.

Represents the data entities (Movie, Genre, Rating).
Each entity class contains fields, constructors, getters, setters, and a toString method.

2.DAO Layer:

Data Access Objects (DAO) handle all database operations.
Each DAO class (MovieDAO, GenreDAO, RatingDAO) includes methods for CRUD operations.
Explanation of Each Component
 DAO (Data Access Object) Layer
GenreDAO.java: Handles all database operations related to the genres table.
MovieDAO.java: Manages CRUD operations for the movies table.
RatingDAO.java: Performs database operations for the ratings table.

3.Service Layer:
GenreService.java: Provides business logic for genres.
MovieService.java: Contains business logic for movies.
RatingService.java: Manages business logic for ratings.
Provides business logic and interacts with the DAO layer.
Each service class (MovieService, GenreService, RatingService) includes methods that call corresponding DAO methods.

Presentation Layer:

MovieDatabaseApp.java: The main application class that interacts with the user.
The main class (MovieDatabaseApp) provides a user interface through a console application.
Contains a menu for users to perform CRUD operations.

Utility Class:

DBUtil class handles database connection setup.

Functionality
Main functionalities implemented in the system:

Movies:
Add a new movie.
Search for a movie by ID.
Update a movie's details.
Delete a movie.
Display all movies.

Genres:
Add a new genre.
Search for a genre by ID.
Update a genre's details.
Delete a genre.
Display all genres.

Ratings:
Add a new rating.
Search for a rating by ID.
Update a rating's details.
Delete a rating.
Display all ratings.

Technical Details
Technical aspects and decisions made during development:

JDBC: Used for database connectivity and executing SQL queries.
MySQL: Database management system used to store the data.
Exception Handling: Robust handling of SQL exceptions to ensure stability.
Scanner: Used for reading user input in the console application.
Connection Management: Proper opening and closing of database connections using the DBUtil class.

Key Features
Highlight the key features and benefits of your system:

Modular Design: Separation of concerns through distinct layers (Model, DAO, Service, Presentation).
Maintainability: Easy to maintain and extend due to the modular design.
Reusability: Service and DAO methods can be reused across different parts of the application.
User-Friendly: Simple console-based interface for ease of use.
