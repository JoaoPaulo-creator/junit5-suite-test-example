package sumnumbers;

import org.junit.jupiter.api.Test;

public class Sum {

    private int sumTwoNumbers(int n1, int n2){
        return n1 + n2;
    }

    @Test
    public void resultadoSoma(){
        if(sumTwoNumbers(2, 2) > 0){
            System.out.println("Result is superior to 0");
        }
    }
    
}
