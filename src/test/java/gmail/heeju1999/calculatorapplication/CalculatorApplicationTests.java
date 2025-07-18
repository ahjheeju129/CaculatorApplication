package gmail.heeju1999.calculatorapplication;

import gmail.heeju1999.calculatorapplication.Service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.sum(2, 2));
    }


}
