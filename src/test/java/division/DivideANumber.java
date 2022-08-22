package division;

import org.junit.jupiter.api.Test;

public class DivideANumber {

    private int dividir(int numerator, int denominator){
        int result = 0;
        try {
             result = numerator / denominator;
        } catch (Exception e) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return result;
    }

    @Test
    public void dividir(){
        System.out.println(dividir(16, 4));
    }
    
}
