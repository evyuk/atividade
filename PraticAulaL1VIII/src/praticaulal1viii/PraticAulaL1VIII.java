package praticaulal1viii;
import java.util.Scanner;

public class PraticAulaL1VIII {

    //Faça um algoritmo que leia uma temperatura em graus Celsius e apresente-a
//convertida em graus Fahrenheit. A fórmula de conversão é: F = (9 * C + 160) / 5, na
//qual F é a temperatura em Fahrenheit e C é a temperatura em Celsius.
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double cels, fahr;
        
        System.out.println("Informe o valor da temperatura em graus celsius:");
        cels = ler.nextDouble();
        fahr = (9 * cels + 160) / 5;
        System.out.println("O valor dessa temperatura em Fahrenheit é: " + fahr);
        
    }
    
}
