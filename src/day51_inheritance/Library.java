package day51_inheritance;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book();
        AudioBook audioBook1 = new AudioBook();
        EBook ebook1 = new EBook();

        book1.title = "James Bond";
        //bookOne reference has access to 6 instance variables which were made in the book class
        ebook1.size = 50;
        ebook1.title = "Mindset";
        //ebook reference has access to 6 instance variables from book class and 2 from Ebook class
        ebook1.read();

        audioBook1.duration=25;
        //audiobook reference has access to 8 instance variables. 6 from book class and 2 from audiobook class.
        //audiobook1.read(); no read method in AudioBook
        audioBook1.listen();


    }
}
