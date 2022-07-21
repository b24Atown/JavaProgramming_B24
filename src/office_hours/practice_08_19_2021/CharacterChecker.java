package office_hours.practice_08_19_2021;

public class CharacterChecker {

    public static void main(String[] args) {

        //checking if a letter is lower or uppercase

        char letter = 'b';
        if(letter>= 'a' && letter <='z'){
            System.out.println("lowercase");
        }else if (letter>= 'A' && letter <= 'Z');{
            System.out.println("uppercase");
        }
    }
}
