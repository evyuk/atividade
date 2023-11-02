package praticaulal1iv;
import java.util.Scanner;

public class PraticAulaL1IV {

    //Faça um algoritmo que: Leia um número inteiro; Leia um segundo número inteiro;
    //Efetue a adição dos dois valores; Apresente o valor calculado.
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numA, numB, total;
        
        System.out.println("Digite o primeiro valor:");
        numA = ler.nextInt();
        System.out.println("Digite o segundo valor:");
        numB = ler.nextInt();
        total = numA + numB;
        System.out.println("O valor da soma dos valores é igual a: " + total);
    }
    
}
