package sample;

public class ArraySample {

    public static void main(String[]args) {
        var number =new int[5];
    
         
        for(var i = 0; i < number.length; i++) {
            number [i] =  i * 2;
    }            
        for(var i=0; i < number.length; i++) {
            System.out.println(number[i]);
    }
  }
}