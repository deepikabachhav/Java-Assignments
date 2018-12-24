package com.capgemini.moviedetails;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestMovieDetails {
	private List<MovieDetails> list=new ArrayList<MovieDetails>();
	private MovieDetails movieOne;
	private MovieDetails movieTwo;
	private MovieDetails movieThree;
	private MovieDetails movieFour ;
	private MovieDetailsList movie;
	
	@Before
	public void setUp(){
		 movieOne= new MovieDetails("3-idiots","Amir Khan","Karin Kapoor","Drama");
		 movieTwo= new MovieDetails("Kuch Kuch hota hai","Shahrukh Khan","Kajol","Romantic");
		 movieThree=new MovieDetails("Baghi","Tiger Shroff","Shradha Kapoor","Action movie");
		 movieFour=new MovieDetails("Conjuring","Robert","anjelina","Horror");
		 movie=new MovieDetailsList();	
	}
	@Test
	public void TestForAddMovie() {
		boolean yesAdd=movie.addMovie(movieOne);
		assertEquals(true,yesAdd);
	}
	
	@Test
	public void TestForRemoveMovie() {
		boolean yesRemove=movie.removeMovie(movieOne);
		assertEquals(false,yesRemove);
	}

	@Test
	public void TestForRemoveAllMovie() {
		boolean yesRemove=movie.removeAll(movieOne);
		assertEquals(false,yesRemove);
	}
	
	@Test
	public void TestForAddMovieone() {
		boolean yesAdd=movie.addMovie(movieOne);
		assertEquals(true,yesAdd);
	}
	
	@Test
	public void TestForFindMovieByMovieName() {
		movie.addMovie(movieOne);
		movie.addMovie(movieTwo);
		movie.addMovie(movieThree);
		movie.addMovie(movieFour);
		MovieDetails picture=movie.findMovieDetailsByMovieName("3-idiots");
		System.out.println(picture);
		//assertEquals("MovieDetails [movieName=3-idiots, leadActor=Amir Khan, leadActress=Karin Kapoor, genre=Drama]",picture);
	}
	
	@Test
	public void TestForFindMovieByGenre() {
		movie.addMovie(movieOne);
		movie.addMovie(movieTwo);
		movie.addMovie(movieThree);
		movie.addMovie(movieFour);
		MovieDetails picture=movie.findMovieDetailsByGenre("Horror");
	}
}
