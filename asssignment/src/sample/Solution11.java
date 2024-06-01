package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution11 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Movie[] movies = new Movie[4];
	        for (int i = 0; i < 4; i++) {
	            String movieName = scanner.nextLine();
	            String company = scanner.nextLine();
	            String genre = scanner.nextLine();
	            int budget = Integer.parseInt(scanner.nextLine());
	            movies[i] = new Movie(movieName, company, genre, budget);
	        }

	        String searchGenre = scanner.nextLine();
	        Movie[] result = getMovieByGenre(movies, searchGenre);

	        for (Movie movie : result) {
	            if (movie.getBudget() > 80000000) {
	                System.out.println("High Budget Movie");
	            } else {
	                System.out.println("Low Budget Movie");
	            }
	        }

	        scanner.close();
	    }

	    public static Movie[] getMovieByGenre(Movie[] movies, String searchGenre) {
	        List<Movie> result = new ArrayList<>();
	        for (Movie movie : movies) {
	            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
	                result.add(movie);
	            }
	        }
	        return result.toArray(new Movie[0]);
	    }
	}

