import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorParameterizedTest {

    @ParameterizedTest
    @ValueSource(strings = {"Java","JS","TS"}) // Each of the Strings like
                                               //         Java is tested with TestCase1 method
                                               //         Js is tested with TestCase1 method
                                               //         TS is tested with TestCase1 method
    void testCase1(String arg){
        Assertions.assertFalse(arg.isEmpty());
    }






}
