package Projetos;

import java.util.*;

public class DesafioFizzBuzz {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

            if((num % 3) == 0 && (num % 5) == 0){
                System.out.println("FizzBuzz");
              }
             else if( (num % 3) == 0 ){
                System.out.print("Fizz");
            }
             else if( (num % 5) == 0 ){
                System.out.print("Buzz");
            }
            
             else {
                System.out.print(num);
            }
        
    }
}