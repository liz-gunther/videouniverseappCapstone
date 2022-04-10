//package com.lizgunther.videouniverseapp.models;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "moviedata")
//public class Movie {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//    private String title;
//    private String year;
//    private String genre;
//    @Column(name = "trailer_link")
//    private String trailerLink;
//    @Column(name = "poster_link")
//    private String posterLink;
//    private String description;
//    @Column(name = "imdbId")
//    private String imdbId;
//
//    public Movie() {
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getYear() {
//        return year;
//    }
//
//    public void setYear(String year) {
//        this.year = year;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public String getTrailerLink() {
//        return trailerLink;
//    }
//
//    public void setTrailerLink(String trailerLink) {
//        this.trailerLink = trailerLink;
//    }
//
//    public String getPosterLink() {
//        return posterLink;
//    }
//
//    public void setPosterLink(String posterLink) {
//        this.posterLink = posterLink;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getImdbId() {
//        return imdbId;
//    }
//
//    public void setImdbId(String imdbId) {
//        this.imdbId = imdbId;
//    }
//
//    @Override
//    public String toString() {
//        return "Movie{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", year='" + year + '\'' +
//                ", genre='" + genre + '\'' +
//                ", trailerLink='" + trailerLink + '\'' +
//                ", posterLink='" + posterLink + '\'' +
//                ", description='" + description + '\'' +
//                ", imdbId='" + imdbId + '\'' +
//                '}';
//    }
//}
