package oops.methods.movieApp;

public class MovieApp {
    public static void main(String[] args) {
        MovieController movieController = new MovieController();
        movieController.createMovie();
        movieController.readMovie();
        movieController.updateMovie();
        movieController.deleteMovie();
    }
}
