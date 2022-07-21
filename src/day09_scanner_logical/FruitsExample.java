package day09_scanner_logical;

public class FruitsExample {

    public static void main(String[] args) {

        int apples = 6;
        boolean check = apples++ * 2>=12 && ++apples + 3 == 10;
        //6*2 >=12 && 8 + 3 == 10
        //12 >=12 && 8+3 ==10
        // 12>=12 && 11 ==10
        // true  &&  false
        //false
        System.out.println(check);
        System.out.println(apples);


        int count = 5;

        System.out.println(count++ == 5 || ++count == 7);
        System.out.println(count);
        //since the left side is already true it doesnt execute past the ||
        //so what youve read  is 5==5|| (past this  it doesnt check since its already true)
        //and if you print count now it has become 6. it incremented post
        //this is just called a short circuit. allows for more efficient execution

        int count2 = 5;

        System.out.println(count2++ == 5 | ++count2 == 7);
        System.out.println(count2);
        //the single | will allow the whole line to calculate thats why the preincrerment past the | still gets  executed and therefore number is 7



    }
}
