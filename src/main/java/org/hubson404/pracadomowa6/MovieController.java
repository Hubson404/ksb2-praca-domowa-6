package org.hubson404.pracadomowa6;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController {

    final MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.findAllMovies();
    }

    @PostMapping("/movies")
    public void addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
    }

}
