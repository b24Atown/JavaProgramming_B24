package day24_loops;

public class CountLetter {
    public static void main(String[] args) {

        //given a string find how many times a specific character is in the String.
        // "java"
        //'a'
        //output: 2 'a' in "java"

        String str = "java has apples";
        int count = 0;

        for(int i = 0;i<str.length();i++){ //can also say i<=str.length() -1;
            if (str.charAt(i) == 'a'){
                count++; //or can say += 1 for this one
            }
            //so we have a string str. and a count. were saying we wannt start at 0 so i=0. were checking i is less than the end of the string length. and we wanna increment i.
            //now were saying if charat a each letter as we go up is equal to a, were gonna increase the count.
            //try to read like this
            // if(str.charAt(0) == 'a'){
            // count++;
            // }
            // if(str.charAt(1) == 'a'){
            // count++;
            // }
            // if(str.charAt(2) == 'a'){
            // count++;
            // }



        }
        System.out.println("there are: "+ count+ " a's");
    }
}
