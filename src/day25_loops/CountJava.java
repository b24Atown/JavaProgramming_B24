package day25_loops;



public class CountJava {

    public static void main(String[] args) {

        String s = "java is a language. java van be used for alot java";
        int java = 0;

        for( int i = 0; i< s.length();i++){


            if (s.charAt(i) == 'j' && s.charAt(i+1) == 'a' && s.charAt(i+2)== 'v' && s.charAt(i+3) == 'a'){
                java++;
            }

        }
        System.out.println(java + " is the count");

        System.out.println("-----------------------------------------" );
        System.out.println("other way");

        /*
        java is a language.
        java  0, 4   i, i + 4
        ava   1, 5   i, i + 4
        va i  2, 6   i, i + 4
         */
        int javaCount = 0;

        for (int i = 0; i<s.length()-3;i++){
            if (s.substring(i, i+4).equals("java")){
                javaCount++;

            }

        }
        System.out.println(javaCount + " is the count of java");

    }
}
