package com.capgemini.moviedetails;

import java.util.Comparator;
/**
 * @author dbachhav
 *MovieNameSort is a class implements comparator interface  and override compare method for sorting as per movie name.
 */
public class MovieNameSort implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails movieOne, MovieDetails movieTwo) {

		return movieOne.getMovieName().compareTo(movieTwo.getMovieName());
	}

}
