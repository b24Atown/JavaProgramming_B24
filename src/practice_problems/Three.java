package practice_problems;

public class Three {

    public static void main(String[] args) {

       //Q3: String -- Remove Duplicates.
        //Write a return method that can remove the duplicated values from String
        //Ex:  removeDup("AAABBBCCC")  ==> ABC

        String word = "AAABBBCCC";
        String result = "";

        for (int i = 0; i<word.length();i++){
            if(!result.contains(""+word.charAt(i))) {
                result += word.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static String noDupesString (String str){
        String result ="";
        for (int i =0; i<str.length();i++){
            if(!result.contains(str.charAt(i) + "")){
                result+=str.charAt(i);
            }
        }
        return result;
    }
    public static String nonD(String str){
        String result = "";
        char [] chars = str.toCharArray();
        for (char each : chars){
            if(!result.contains(each + "")){
                result+= chars;
            }
        }
        return result;
    }
}
