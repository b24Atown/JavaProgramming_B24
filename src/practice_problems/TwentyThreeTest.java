package practice_problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TwentyThreeTest {
    @ParameterizedTest
    @CsvSource({"11, is a prime number",
            "10, is not a prime number"})


    public void primeNumTest(int num,String name){

        assertEquals(num + " " + name,TwentyThree.primeNum(num));

    }

}