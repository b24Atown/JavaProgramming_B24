package day27_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String s = "java";
        /*
String

is my char unique

apple
a l e are unique characters. p is not unique.


 */

        for (int i = 0; i<s.length();i++){

            int count = 0;//count is inside the loop because we needed to reset it. so everytime outer loop runs, it resets count to 0.

            for(int j = 0; j<s.length();j++){

                if(s.charAt(i)== s.charAt(j)){
                    count++;

                }
            }
            if(count==1){
                System.out.println(s.charAt(i)+ " is unique");
            }
        }
    }
}
