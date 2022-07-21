package day05_variables;

public class Movie {

    public static void main(String[] args) {

        String name = "Superman";
        String genre = "Action";
        int duration = 192;
        String releaseDate = "August 20th";
        char rating = 'E';
        boolean isSequel = true;
        int rottenTomatoesRating = 88;
        boolean isOnDVD = true;

        System.out.println("------Welcome to the Cinema ------" + "\n");
        System.out.println("Tonight we are streaming " + name + " which was released on " + releaseDate + ".\n");
        System.out.println("This " + genre + " movie got a " + rottenTomatoesRating + " rating on Rotten Tomatoes." + "\n");
        System.out.println("The rating is " + rating + " and it runs for " + duration + " minutes." + "\n");
        System.out.println("This is a sequel " + isSequel + " and is on dvd " + isOnDVD);



    }
}
