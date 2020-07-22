package com.example.demo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Profile;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movie {

    private String title;
    @JsonProperty("Title")
    public String getTitle() { return title; }
    @JsonProperty("Title")
    public void setTitle(String title) { this.title = title; }

    private int minutes;
    @JsonProperty("Minutes")
    public int getMinutes() { return minutes; }
    @JsonProperty("Minutes")
    public void setMinutes(int minutes) { this.minutes = minutes; }

    private String genre;
    @JsonProperty("Genre")
    public String getGenre() { return genre; }
    @JsonProperty("Menre")
    public void setGenre(String genre) { this.genre = genre; }

    public double rating;
    @JsonProperty("Rating")
    public double getRating() { return rating; }
    @JsonProperty("Rating")
    public void setRating(double rating) { this.rating = rating; }

    private int metascore;
    @JsonProperty("Metascore")
    public int getMetascore() { return metascore; }
    @JsonProperty("Metascore")
    public void setMetascore(int metascore) { this.metascore = metascore; }

    private String description;
    @JsonProperty("Description")
    public String getDescription() { return description; }
    @JsonProperty("Description")
    public void setDescription(String description) { this.description = description; }

    private int votes;
    @JsonProperty("Votes")
    public int getVotes() { return votes; }
    @JsonProperty("Votes")
    public void setVotes(int votes) { this.votes = votes; }

    private double gross;
    @JsonProperty("Gross")
    public double getGross() { return gross; }
    @JsonProperty("gross")
    public void setGross(double gross) { this.gross = gross; }

    private int year;
    @JsonProperty("Year")
    public int getYear() { return year; }
    @JsonProperty("Year")
    public void setYear(int year) { this.year = year; }

    private Credits[] credits;
    @JsonProperty("Credits")
    public Credits[] getCredits() { return credits; }
    @JsonProperty("Credits")
    public void setCredits(Credits[] credits) { this.credits = credits; }

    static class Credits {

        private Actors actor;

        @JsonProperty("Person")
        public Actors getActor() { return actor; }
        @JsonProperty("Person")
        public void setActor(Actors actor) { this.actor = actor; }

        static class Actors {

            private String role;
            @JsonProperty("Role")
            public String getRole() { return role; }
            @JsonProperty("Role")
            public void setRole(String role) { this.role = role; }

            private String firstName;
            @JsonProperty("FirstName")
            public String getFirstName() { return firstName; }
            @JsonProperty("FirstName")
            public void setFirstName(String firstName) { this.firstName = firstName; }

            private String lastName;
            @JsonProperty("LastName")
            public String getLastName() { return lastName; }
            @JsonProperty("LastName")
            public void setLastName(String lastName) { this.lastName = lastName; }
        }
    }
}
