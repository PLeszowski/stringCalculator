import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Task:
 * https://github.com/mwhelan/Katas/tree/master/Katas.StringCalculator
 *
 */
@RunWith(JUnitParamsRunner.class)
public class StringCalculatorTest {

    StringCalculator testedObject;

    @Before
    public void setUp(){
        testedObject = new StringCalculator();
    }

    private Object[][] dataForTestingOutput(){
		return new Object[][]{
				{"", 0},
				{"1", 1},
				{"1,2", 3},
				{"1,4", 5},
				{"1,4,2", 5},
				{"10000,10000", 20000}
		};
	}

    @Parameters(method = "dataForTestingOutput")
    @Test
    public void shouldReturnProperOutputForGivenInput (String input, int expectedResult){
    	int result = testedObject.add(input);

    	assertThat(result).isEqualTo(expectedResult);

    }


}
