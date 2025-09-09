package com.luisjaramillo.playamovie.web.controller;

import com.luisjaramillo.playamovie.domain.dto.MovieDto;
import com.luisjaramillo.playamovie.domain.service.MovieService;
import com.luisjaramillo.playamovie.persistence.crud.CrudMovie;
import com.luisjaramillo.playamovie.persistence.entity.MovieEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

  private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<MovieDto> getAllMovies() {
        return (List<MovieDto>) this.movieService.getAll();
    }
}
