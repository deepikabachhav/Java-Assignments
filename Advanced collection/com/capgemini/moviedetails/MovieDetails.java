package com.capgemini.moviedetails;

public class MovieDetails {
	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre;
	
	public MovieDetails(String movieName, String leadActor, String leadActress,
			String genre) {
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}

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

	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor="
				+ leadActor + ", leadActress=" + leadActress + ", genre="
				+ genre + "]";
	}

}
