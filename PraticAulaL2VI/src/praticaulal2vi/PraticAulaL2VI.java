package praticaulal2vi;
import java.util.Scanner;

public class PraticAulaL2VI {

    //O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um
//algoritmo que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar.
//Assuma que a balança já desconte o peso do prato.
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double pesopt, valorpg;
        
        System.out.println("O peso do prato do cliente é, em quilos:");
        pesopt = ler.nextDouble();
        valorpg = pesopt * 12;
        System.out.println("O valor total a ser pago pelo prato é de: " + valorpg);
    }
    
}
