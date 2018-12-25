package com.capgemini.moviedetails;

import java.util.Comparator;
/**
 * @author dbachhav
 *LeadActressSort is a class implements Comparator interface and override compare method for sorting.
 */
public class LeadActressSort implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails movieone, MovieDetails movietwo) {

		return movieone.getLeadActress().compareTo(movietwo.getLeadActress());
	}
}
