//package com.lizgunther.videouniverseapp.services;
//
//import com.lizgunther.videouniverseapp.models.Movie;
//import com.lizgunther.videouniverseapp.repository.MovieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class MovieServiceImpl implements MovieService{
//
//    private MovieRepository movieRepository;
//
//    @Autowired
//    public MovieServiceImpl(MovieRepository movieRepository) {
//        this.movieRepository = movieRepository;
//    }
//
//    @Override
//    public Movie getMovieByGenre(String genre) {
//        return movieRepository.getMovieByGenre(genre);
//    }
//
//    @Override
//    public Movie getRandomMovie() {
//        return movieRepository.getRandomMovie();
//    }
//
//    @Override
//    public Movie getMovieById(long id) {
//        return movieRepository.getMovieById(id);
//    }
//}
