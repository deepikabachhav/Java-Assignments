package com.capgemini.moviedetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * @author dbachhav
 *MovieComparatorChaining is a class for the comparator chaining.
 */
public class MovieComparatorChaining implements Comparator<MovieDetails> {
	private List<Comparator<MovieDetails>> listComparators = new ArrayList<Comparator<MovieDetails>>();;

	@SafeVarargs
	public MovieComparatorChaining(Comparator<MovieDetails>... comparators) {
		this.listComparators = Arrays.asList(comparators);
	}
	
	/**
	 * Comparator interface Overrides compare method.
	 */
	@Override
	public int compare(MovieDetails arg0, MovieDetails arg1) {
		for (Comparator<MovieDetails> comparator : listComparators) {
			int result = comparator.compare(arg0, arg1);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}

}
