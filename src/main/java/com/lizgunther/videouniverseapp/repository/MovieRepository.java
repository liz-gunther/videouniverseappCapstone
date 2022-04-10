//package com.lizgunther.videouniverseapp.repository;
//
//import com.lizgunther.videouniverseapp.models.Movie;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//public interface MovieRepository extends JpaRepository<Movie, Long> {
//
//    @Query(nativeQuery = true, value = "SELECT * FROM moviedata m WHERE m.genre = :genre ORDER BY RAND() LIMIT 1;")
//    Movie getMovieByGenre(@Param("genre") String genre);
//
//    @Query(nativeQuery = true, value = "SELECT * FROM moviedata m ORDER BY RAND() LIMIT 1;")
//    Movie getRandomMovie();
//
//    @Query(nativeQuery = true, value = "SELECT * FROM moviedata m WHERE m.id = :id")
//    Movie getMovieById(@Param("id") long id);
//
//    void addMovieToWishlist(long id);
//
//    void deleteMovieFromWishlist(long id);
//
//}
