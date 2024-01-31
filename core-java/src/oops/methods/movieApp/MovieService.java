package oops.methods.movieApp;

public class MovieService {
    MovieDao movieDao = new MovieDao();
    public void createMovie() {
        movieDao.createMovie();
    }

    public void readMovie() {
        movieDao.readMovie();
    }

    public void updateMovie() {
        movieDao.updateMovie();
    }

    public void deleteMovie() {
        movieDao.deleteMovie();
    }
}
