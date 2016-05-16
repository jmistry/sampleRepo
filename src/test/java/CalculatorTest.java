import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Jaisheel.Mistry on 2016/05/16.
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp()  {
        calculator = new Calculator();
    }

    @Test
    public void add()  {
        int result = calculator.add("1,2");
        assertThat(result,is(3));
    }

}