package Projetos;

import java.util.*;
 public class EcontrandoPercentual {

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
		
    int M = input.nextInt();
    int S = input.nextInt();  
    
    float produto = ((float)(M - S) / M)*100;

    System.out.println("O Desconto foi de " + produto + "%");

    
}
}