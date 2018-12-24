package com.capgemini.moviedetails;
import java.util.ArrayList;
import java.util.List;

public class MovieDetailsList {
	private List<MovieDetails> list= new ArrayList<MovieDetails>();
	
	public boolean addMovie(MovieDetails movieOne){
		return list.add(movieOne);
	}
	
	public boolean removeMovie(MovieDetails movieOne) {
		return list.remove(movieOne);
	}
	
	public boolean removeAll(MovieDetails movie){
		return list.removeAll(list);
	}
	
	public MovieDetails findMovieDetailsByMovieName( String movieName){
		for(MovieDetails detail : list){
			if(detail.getMovieName().matches(movieName)){
				return detail;
			}
		}
		return null;
	}
	
	
	public MovieDetails findMovieDetailsByGenre( String genre){
		for(MovieDetails detail : list){
			if(detail.getGenre().matches(genre)){
				return detail;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "MovieDetailsList [list=" + list + "]";
	}

}
