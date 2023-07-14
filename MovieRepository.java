package com.projects.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //we can implement methods ourselve such as findByImbd it is not present by default
    //automatic queries lets us form queries directly from property names

    Optional<Movie> findByImdbId(String ImbdId);        //writing this only works spring daat mongo will understand & is capable to generate the desired result

}
