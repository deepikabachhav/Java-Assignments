package com.capgemini.moviedetails;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
/**
 * @author dbachhav
 *MovieDetailsList is a class contains methods addMovie,removeMovie ,removeAll, findMovieDetailsByMovieName, findMovieDetailsByGenre.
 */
public class MovieDetailsList  {
	private ArrayList<MovieDetails> list= new ArrayList<MovieDetails>();
 	
	/**
	 * addMovie is a method to add movie in the list return movie added list.
	 * @param movieOne
	 * @return
	 */
	public boolean addMovie(MovieDetails movieOne){
		return list.add(movieOne);
	}
	
	/**
	 * removeMovie is a method to remove movie from the list and return movie removed list.
	 * @param movieOne
	 * @return
	 */
	public boolean removeMovie(MovieDetails movieOne) {
		return list.remove(movieOne);
	}
	
	/**
	 * removeAll is a method to remove all movies from list return null list.
	 * @param movie
	 * @return
	 */
	public boolean removeAll(MovieDetails movie){
		return list.removeAll(list);
	}
	
	/**
	 * findMovieDetailsByMovieName is a method for finding the movie by giving movie name and it return movieDetailList of the given movie.
	 * @param movieName
	 * @return
	 */
	public MovieDetails findMovieDetailsByMovieName( String movieName){
		for(MovieDetails detail : list){
			if(detail.getMovieName().matches(movieName)){
				return detail;
			}
		}
		return null;
	}
	
	/**
	 * findMovieDetailsByGenre is a method for finding the movie by giving genre and return MovieDetaillist of the given movie.
	 * @param genre
	 * @return
	 */
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
	
	public void sortByParameters(int choice){
		switch(choice){
		case 1: {Collections.sort(list, new MovieComparatorChaining(new MovieNameSort()));
			     	break;
				}
		case 2:{Collections.sort(list, new MovieComparatorChaining(new LeadActorSort()));
					break;
			   }
		case 3:{Collections.sort(list, new MovieComparatorChaining(new LeadActressSort()));
					break;
			   }
		case 4:{Collections.sort(list, new MovieComparatorChaining(new MovieGenreSort()));
					break;
			  }
		}
	}
}
