package com.capgemini.moviedetails;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

/**
 * @author dbachhav
 * TestMovieDetails is a class checks all test given-TestForAddMovie, TestForRemoveMovie, TestForRemoveAllMovie, TestForFindMovieByMovieName,
 * TestForFindMovieByGenre,TestForSortingOn-MovieName,LeadActor,LeadActress, Genre.
 */
public class TestMovieDetails {
	private ArrayList<MovieDetails> list= new ArrayList<MovieDetails>();
 	private MovieDetails movieOne;
	private MovieDetails movieTwo;
	private MovieDetails movieThree;
	private MovieDetails movieFour ;
	private MovieDetails movieFive;
	private MovieDetailsList movie;
 
	@Before
	public void setUp(){
		 movieOne= new MovieDetails("3-idiots","Amir Khan","Karin Kapoor","Drama");
		 movieTwo= new MovieDetails("Kuch Kuch hota hai","Shahrukh Khan","Kajol","Romantic");
		 movieThree=new MovieDetails("Baghi","Tiger Shroff","Shradha Kapoor","Action movie");
		 movieFour=new MovieDetails("Conjuring","Robert","anjelina","Horror");
		 movieFive=new MovieDetails("Conjuring","Robert","anjelina","Horror");
		 movie=new MovieDetailsList();	
		 
		
	}
	@Test
	public void testForAddMovie() {
		boolean yesAdd=movie.addMovie(movieOne);
		assertEquals(true,yesAdd);
	}
	
	@Test
	public void testForRemoveMovie() {
		boolean yesRemove=movie.removeMovie(movieOne);
		assertEquals(false,yesRemove);
	}

	@Test
	public void testForRemoveAllMovie() {
		boolean yesRemove=movie.removeAll(movieOne);
		assertEquals(false,yesRemove);
	}
	
	@Test
	public void testForAddMovieone() {
		boolean yesAdd=movie.addMovie(movieOne);
		assertEquals(true,yesAdd);
	}
	
	@Test
	public void testForFindMovieByMovieName() {
		movie.addMovie(movieOne);
		movie.addMovie(movieTwo);
		movie.addMovie(movieThree);
		movie.addMovie(movieFour);
		MovieDetails picture=movie.findMovieDetailsByMovieName("3-idiots");
	}
	
	@Test
	public void testForFindMovieByGenre() {
		movie.addMovie(movieOne);
		movie.addMovie(movieTwo);
		movie.addMovie(movieThree);
		movie.addMovie(movieFour);
		MovieDetails picture=movie.findMovieDetailsByGenre("Horror");
	}
	
	@Test
	public void testForSortingOnMovieName(){
		movie.addMovie(movieOne);
		movie.addMovie(movieTwo);
		movie.addMovie(movieThree);
		movie.addMovie(movieFour);
		movie.sortByParameters(1);
		
	}
	
	@Test
	public void testForSortingOnLeadActor(){
		movie.addMovie(movieOne);
		movie.addMovie(movieTwo);
		movie.addMovie(movieThree);
		movie.addMovie(movieFour);
		movie.addMovie(movieFive);
		movie.sortByParameters(2);
	}
	
	@Test
	public void testForSortingOnLeadActress(){
		movie.addMovie(movieOne);
		movie.addMovie(movieTwo);
		movie.addMovie(movieThree);
		movie.addMovie(movieFour);
		movie.addMovie(movieFive);
		movie.sortByParameters(3);
	}
	
	@Test
	public void testForSortingOnMovieGenre(){
		movie.addMovie(movieOne);
		movie.addMovie(movieTwo);
		movie.addMovie(movieThree);
		movie.addMovie(movieFour);
		movie.addMovie(movieFive);
		movie.sortByParameters(4);
	}
}
