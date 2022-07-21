package day25_loops;

public class BreakExample {
    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            if (i==3){
                break;
                //we only see 0,1,2 since it wont let it go to 3. we should just make the condition on i<5 to i<3 so we have it actually stop at 3. break is not neccessary and discouraged.
            }
            System.out.println(i);
        }

        for(int is = 0; is<5; is++){
            System.out.println(is);

            break;
            //break will stop it right away and will only print the i = 0 value.

        }
    }
}
