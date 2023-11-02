package praticaulal2ii;
import java.util.Scanner;
        
public class PraticAulaL2II {
    
    //Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os
    //cavalos comprados para um haras.

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int cavalos, total;
        System.out.println("Informe o número de cavalos no haras: ");
        cavalos = ler.nextInt();
        total = cavalos * 4;
        System.out.println("O número de ferraduras necessárias para equipar " + cavalos + " cavalos é: " + total);
        
    }
    
}
