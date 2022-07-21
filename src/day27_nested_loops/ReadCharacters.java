package day27_nested_loops;

public class ReadCharacters {

    public static void main(String[] args) {

        String s = "java";

        for(int i = 0; i<s.length();i++){

            for (int j = 0; j<=i; j++){

                System.out.print(s.charAt(j));
            }
            System.out.println();//this falls within the first loop so it go to next line once inner loop is finished. so i gets printed then inner loop then space.
        }
    }
}

