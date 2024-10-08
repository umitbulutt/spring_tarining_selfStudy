import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class CalculatorParameterizedTest {

    @ParameterizedTest
  //  @MethodSource
  //  @CsvSource
  //  @CsvFileSource
    @ValueSource(strings = {"Java","JS","TS"}) // Each of the Strings like
                                               //         Java is tested with TestCase1 method
                                               //         Js is tested with TestCase1 method
                                               //         TS is tested with TestCase1 method
    void testCase1(String arg){
        Assertions.assertFalse(arg.isEmpty());
    }


    @ParameterizedTest
    @ValueSource(ints = {3,6,9})
    void testCase1(int num){
        Assertions.assertEquals(0,num%3);
    }


    @ParameterizedTest
    @ValueSource(strings = {"Java","JS","TS"})
    //@EmptySource           // ""
    //@NullSource
    @NullAndEmptySource
    void testCase2(String arg){
        Assertions.assertFalse(arg.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testCase4(String arg){
        Assertions.assertFalse(arg.isEmpty());
    }
    static String[] stringProvider(){
        return new String[] {"Java","JS","TS"};
    }


    @ParameterizedTest
    @DisplayName("Check the table")
    @CsvSource({
            "10,20,30",
            "20,20,40",
            "30,20,50"
    })
    void testCase5(int num1, int num2, int result){
        Assertions.assertEquals(result,Calculator.add(num1,num2));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/sample-data.csv" , numLinesToSkip = 1)
    void  testCase6(int num1, int num2, int result){
        Assertions.assertEquals(result,Calculator.add(num1,num2));
    }





}
