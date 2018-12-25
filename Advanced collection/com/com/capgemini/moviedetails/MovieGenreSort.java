package com.capgemini.moviedetails;

import java.util.Comparator;
/**
 * @author dbachhav
 *MovieGenreSort is a class to implement comparator interface and override compare method for sorting.
 */
public class MovieGenreSort implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails movieone, MovieDetails movietwo) {

		return movieone.getGenre().compareTo(movietwo.getGenre());
	}

}
