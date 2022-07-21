package office_hours.practice_08_25_2021;

public class MoveFirstWord {

    public static void main(String[] args) {
        //given a sentence, display the sentence with the first word moved to the end of the sentence. ex java is a fun language -> is a fun language java

        String str = "Java is a fun language";

        int space = str.indexOf(" ");

        String remaining = str.substring(space +1); //or str.substring(space).trim();
        String firstWord = str.substring(0,space);

        remaining = remaining.substring(0,1).toUpperCase() + remaining.substring(1);
        firstWord = firstWord.toLowerCase();

        System.out.println(remaining+ " " + firstWord);

    }
}
