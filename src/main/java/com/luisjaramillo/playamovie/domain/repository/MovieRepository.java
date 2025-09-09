package com.luisjaramillo.playamovie.domain.repository;

import com.luisjaramillo.playamovie.domain.dto.MovieDto;

import java.util.List;

public interface MovieRepository {
    public List<MovieDto> getAllMovies();
}
