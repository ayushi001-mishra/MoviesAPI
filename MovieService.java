package com.projects.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired                              //Autowire is used to intiallize the refernce variable
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    //public Optional<Movie> singleMovie(ObjectId id){         //optimal as it amy return null
    //return movieRepository.findById(id);
    //}

    public Optional<Movie> singleMovieImdb(String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }
}
