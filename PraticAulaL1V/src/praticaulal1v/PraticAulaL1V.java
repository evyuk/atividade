package praticaulal1v;
import java.util.Scanner;

public class PraticAulaL1V {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double area, raio, pi;
        
        System.out.println("Defina o valor do raio:");
        raio = ler.nextDouble();
        pi = 3.14159;
        area = pi * Math.pow(raio, 2);
        System.out.println("O valor da área de uma circunferência é: " + area);
    }
    
}
