package com.luisjaramillo.playamovie.domain.dto;

public record MovieDto(
        String title,
        String genre,
        Integer releaseYear,
        String director,
        String description
) {
}
