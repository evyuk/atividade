package praticaulal1ii;
import java.util.Scanner;

public class PraticAulaL1II {

   //Faça um algoritmo que receba o nome e a idade de uma pessoa e ao final mostre os
//valores digitados.
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.println("Qual o seu nome? ");
        nome = ler.next();
        System.out.println("Qual a sua idade: ");
        idade = ler.nextInt();
        System.out.println("Seu nome é " + nome + " e tem " + idade + " anos.");
                
    }
    
}
