package praticaulaviii;
import java.util.Scanner;

public class PraticAulaVIII {

    //Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua média
    //ponderada (as notas tem pesos respectivos de 1, 2 e 3).

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double notaA, notaB, notaC, mediaP;
        
        System.out.println("Informe a primeira nota:");
        notaA = ler.nextDouble();
        System.out.println("Informe a segunda nota:");
        notaB = ler.nextDouble();
        System.out.println("Informe a terceira nota:");
        notaC = ler.nextDouble();
        mediaP = (notaA * 1 + notaB * 2 + notaC * 3) / (1 + 2 + 3);
        System.out.println("A média ponderada do aluno é: " + mediaP);
    }
    
}
