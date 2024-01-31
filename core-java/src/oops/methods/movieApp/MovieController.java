package oops.methods.movieApp;

public class MovieController {
    MovieService movieService = new MovieService();
    public void createMovie() {
        movieService.createMovie();
    }

    public void readMovie() {
        movieService.readMovie();
    }

    public void updateMovie() {
        movieService.updateMovie();
    }

    public void deleteMovie() {
        movieService.deleteMovie();
    }
}
