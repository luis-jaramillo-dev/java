package com.luisjaramillo.playamovie.domain.service;

import com.luisjaramillo.playamovie.domain.dto.MovieDto;
import com.luisjaramillo.playamovie.domain.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public List<MovieDto> getAll() {
        return this.movieRepository.getAllMovies();
    }
}
