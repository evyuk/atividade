package praticaulal1ix;
import java.util.Scanner;

public class PraticAulaL1IX {

    //Faça um algoritmo que leia uma temperatura em Fahrenheit e a apresente convertida
//em graus Celsius. A fórmula de conversão é C = (F - 32) * ( 5 / 9), na qual F é a
//temperatura em Fahrenheit e C é a temperatura em Celcius.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double fahr, cels;
        
        System.out.println("Informe o valor da temperatura em Fahrenheit:");
        fahr = ler.nextDouble();
        cels = (fahr - 32) * (5.0 / 9.0);
        System.out.println("O valor dessa temperatura em graus Celsius é: " + cels);
        
    }
    
}
