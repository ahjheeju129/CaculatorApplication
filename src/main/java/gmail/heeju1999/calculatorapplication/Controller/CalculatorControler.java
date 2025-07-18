package gmail.heeju1999.calculatorapplication.Controller;

import gmail.heeju1999.calculatorapplication.Service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorControler {
    @Autowired
    private Calculator calculator;


    @RequestMapping("/")
    String index(){
        return "Hello World";
    }

    @RequestMapping("/sum")
    String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b){
        return String.valueOf(calculator.sum(a,b));
    }
}
