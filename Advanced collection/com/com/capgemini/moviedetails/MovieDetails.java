package com.capgemini.moviedetails;

/**
 * @author dbachhav
 *MovieDetails is class implements comparable interface and have instance members movieName,leadActor, leadActress, genre.
 */
public class MovieDetails implements Comparable<MovieDetails> {
	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre;
	
	/**
	 * Constructor for initiate instance members.
	 * @param movieName
	 * @param leadActor
	 * @param leadActress
	 * @param genre
	 */
	public MovieDetails(String movieName, String leadActor, String leadActress,
			String genre) {
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}
	/**
	 * Getter method return values .
	 * @return
	 */
	public String getMovieName() {
		return movieName;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public String getGenre() {
		return genre;
	}
	/**
	 * toString method to display .
	 */
	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor="
				+ leadActor + ", leadActress=" + leadActress + ", genre="
				+ genre + "]";
	}
	
	/**
	 * compareTo() is a overriding method used for sorting on the specific field.
	 */
 
	@Override
	public int compareTo(MovieDetails detail) {
		return  this.movieName.compareTo(detail.movieName);
	}

}

