package praticaulal1i;
import java.util.Scanner;

public class PraticAulaL1I {

    //Faça um algoritmo que receba dois números inteiros e mostre a subtração entre eles.
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nA, nB, total;
        
        System.out.println("Digite o primeiro número");
        nA = ler.nextInt();
        System.out.println("Digite o segundo número");
        nB = ler.nextInt();
        total = nA - nB;
        System.out.println("O valor total da subtração é: " + total);
        
    }
    
}
