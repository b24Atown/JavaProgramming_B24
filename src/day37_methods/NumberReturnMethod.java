package day37_methods;

public class NumberReturnMethod {

    public static void main(String[] args) {

        System.out.println(convertNumberToWord(4));
        System.out.println(convertNumberToWord(11));


    }


    public static String convertNumberToWord(int num) {
        if (num < 0 || num > 10) {
            return "Out of Range";
        }
        String[] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        return words[num - 1];


    }


    //other way to do it

    public static String convertNumberToWord2(int numba) {
        String wor = "";
        switch (numba) {
            case 1:
                wor = "one";
                break;
            case 2:
                wor = "two";
                break;
            case 3:
                wor = "three";
                break;
            case 4:
                wor = "four";
                break;
            case 5:
                wor = "five";
                break;
            case 6:
                wor = "six";
                break;
            case 7:
                wor = "seven";
                break;
            case 8:
                wor = "eight";
                break;
            case 9:
                wor = "nine";
                break;
            case 10:
                wor = "ten";
                break;
            default:
                wor = "invalid entry";
        }
        return wor;
    }
    //yet another way to do it

    public static String convertNumberToWord3(int num) {
        switch (num) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            default: return "out of range";

        }
    }
}




