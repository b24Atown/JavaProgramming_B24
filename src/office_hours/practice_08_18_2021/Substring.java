package office_hours.practice_08_18_2021;

public class Substring {

    public static void main(String[] args) {

        String word = "hello_world@hello.com";
                //     0123456789

        System.out.println(word.substring(word.indexOf('_')+1,word.indexOf('@')));
        //substring 0,5 hello
        System.out.println(word.substring(0,5));

    }
}
