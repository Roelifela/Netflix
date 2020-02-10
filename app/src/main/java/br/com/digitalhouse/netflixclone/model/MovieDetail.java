package br.com.digitalhouse.netflixclone.model;

import java.util.List;

public class MovieDetail {

    private final Movie movie;
    private final List<Movie> moviesSimilar;


    public MovieDetail(Movie movie, List<Movie> movieSimilar){
        this.movie = movie;
        this.moviesSimilar = movieSimilar;
    }

    public Movie getMovie() {
        return movie;
    }

    public List<Movie> getMoviesSimilar() {
        return moviesSimilar;
    }


}
