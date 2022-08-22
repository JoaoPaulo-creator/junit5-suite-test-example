package writeaname;


import org.junit.jupiter.api.Test;

public class WriteNames {

    
    @Test
    public void cumprimentar(){
        String[] nameList = {"Joao", "Rafael", "Lucas"};
        
        for(String name: nameList){
            System.out.println(name);
        }
    }


}
