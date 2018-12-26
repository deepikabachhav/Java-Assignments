package com.capgemini.moviedetails;

import java.util.Comparator;
/**
 * @author dbachhav
 *LeadActorSort is a class which implements comparator interface.
 */
public class LeadActorSort implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails actorOne, MovieDetails actorTwo) {

		return actorOne.getLeadActor().compareTo(actorTwo.getLeadActor());
	}

}
