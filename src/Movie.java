public class Movie {
    String movieName;
    String movieAuthor;
    String requiredPlan;

    Movie() {
        this.movieName = "Top Gun Maverick";
        this.movieAuthor = "Joseph Kosinski";
        this.requiredPlan = "Plus";
    }

    public static void main(String[] args) {
        // objet imported from the class Movie
        Movie movie = new Movie();

        String currentPlan = "Plus";

        if (currentPlan.equals(movie.requiredPlan)) {
            System.out.println("You can watch the movie!");
        } else {
            System.out.println("You cannot watch the movie!");
        }
        System.out.println(movie.requiredPlan);
    }
}
