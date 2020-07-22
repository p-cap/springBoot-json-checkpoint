package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class movieController {
    @GetMapping("/movie")
    //URL: localhost:8080/movies/movie
    public Movie getMovies() {

        Movie movie = new Movie();
        movie.setTitle("The Godfather");
        movie.setMinutes(175);
        movie.setGenre("Crime, Drama");
        movie.setRating(9.2);
        movie.setMetascore(100);
        movie.setDescription("The aging patriarch of an organized crime dynasty transfers control " +
                "of his clandestine empire to his reluctant son.");
        movie.setVotes(1561591);
        movie.setGross(134.97);
        movie.setYear(1972);

        Movie.Credits[] credits = new Movie.Credits[5];

        Movie.Credits.Actors actors = new Movie.Credits.Actors();
        actors.setRole("Director");
        actors.setFirstName("Francis Ford");
        actors.setRole("Copolla");
        credits[0] = new Movie.Credits();
        credits[0].setActor(actors);
        movie.setCredits(credits);

        Movie.Credits.Actors actors1 = new Movie.Credits.Actors();
        actors1.setRole("Star");
        actors1.setFirstName("Marlon");
        actors1.setLastName("Brnado");
        credits[1] = new Movie.Credits();
        credits[1].setActor(actors1);
        movie.setCredits(credits);

        Movie.Credits.Actors actors2 = new Movie.Credits.Actors();
        actors2.setRole("Star");
        actors2.setFirstName("Al");
        actors2.setLastName("Pacino");
        credits[2] = new Movie.Credits();
        credits[2].setActor(actors2);
        movie.setCredits(credits);

        Movie.Credits.Actors actors3 = new Movie.Credits.Actors();
        actors3.setRole("Star");
        actors3.setFirstName("James");
        actors3.setLastName("Caan");
        credits[3] = new Movie.Credits();
        credits[3].setActor(actors3);
        movie.setCredits(credits);

        Movie.Credits.Actors actors4 = new Movie.Credits.Actors();
        actors4.setRole("Star");
        actors4.setFirstName("Diane");
        actors4.setLastName("Keaton");
        credits[4] = new Movie.Credits();
        credits[4].setActor(actors4);
        movie.setCredits(credits);

        return movie;
    }


    @PostMapping("/gross/total")
    public Map<String,Double> getTotalGross(@RequestBody() Movie[] movies) {
        double total = 0;

        //Add both Movies objects in the array
        total = movies[0].getGross() + movies[1].getGross();

        Map<String, Double> result = new HashMap<>();
        result.put("result", total);
        return result;

    }
} //end of movieController
