package org.hubson404.pracadomowa6;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    private final List<Movie> movieList;

    @EventListener(ApplicationReadyEvent.class)
    public void initRepository() {
        movieList.add(new Movie("Terminator", "1980"));
        movieList.add(new Movie("Star Wars", "1976"));
        movieList.add(new Movie("Tokyo Drift", "2008"));
    }

    public MovieRepository() {
        this.movieList = new ArrayList<>();
    }

    public List<Movie> findAll() {
        return movieList;
    }

    public void save(Movie movie) {
        movieList.add(movie);
    }
}
