package praticaulal2i;
import java.util.Scanner;

public class PraticAulaL2I {

//A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as
//dimensões de um terreno e depois exibir a área do terreno.
    
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double base, altura, area;
    System.out.println("Informe valor da base do terreno: ");
    base = ler.nextDouble();
    System.out.println("Informe valor da altura do terreno: ");
    altura = ler.nextDouble();
    area = base * altura;
    System.out.println("A área total do terreno é: " + area);
    }
    
}
