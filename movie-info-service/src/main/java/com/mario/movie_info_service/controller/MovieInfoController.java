package com.mario.movie_info_service.controller;

import com.mario.movie_info_service.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieInfo")
public class MovieInfoController {

    @GetMapping("/{movieId}")
    public Movie getCatalog(@PathVariable("movieId") String movieId) {
        return new Movie(movieId, "Transformer", "MovieDescription");
    }

}
