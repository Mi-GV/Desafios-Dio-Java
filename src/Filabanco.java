import java.util.Scanner; 

public class Filabanco {
 
    public static void main(String[] args) { 
 
    String[] nomesFila = new String[5]; 
    Scanner nome = new Scanner(System.in); 
   
    for (int i = 0; i < nomesFila.length; i++){
    // for (int i = 0; i < 3; i= i +1)

        nomesFila[i] = nome.next();
    }
    // System.out.println( nomesFila[0] + " - esta na posicao: 1");
    for (int i = 0; i < nomesFila.length; i++){
        System.out.println(nomesFila[i] + " - esta na posicao:" + (i+1));
    }
    

}
}