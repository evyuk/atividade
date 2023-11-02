package praticaulal1x;
import java.util.Scanner;

public class PraticAulaL1X {

    //Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo,
//utilizando a fórmula VOLUME = 3,14159 * (RAIO²) * ALTURA.
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raio, altura, vol;
        
        System.out.println("Para calcular o volume de uma lata de óleo, primeiro informe o valor do raio:");
        raio = ler.nextDouble();
        System.out.println("Agora informe o valor da altura da lata:");
        altura = ler.nextDouble();
        vol = 3.14159 * Math.pow(raio, 2) * altura;
        System.out.println("O valora do volume da lata de óleo é: " + vol);
    }
    
}
