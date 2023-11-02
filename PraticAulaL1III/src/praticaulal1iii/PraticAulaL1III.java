package praticaulal1iii;
import java.util.Scanner;

public class PraticAulaL1III {

    //Faça um algoritmo que: Leia o nome; Leia o sobrenome; Junte o nome com o sobrenome; Apresente o nome completo.
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, sbnome, completo;
    
        System.out.println("Qual é o seu nome?");
        nome = ler.next();
        System.out.println("Qual é o seu sobrenome?");
        sbnome = ler.next();
        completo = nome + " " + sbnome;
        System.out.println("Seu nome completo é: " + completo);
    }
    
}
