package praticaulal1vi;
import java.util.Scanner;

public class PraticAulaL1VI {
    
    //Faça um algoritmo que calcule a área de um triângulo, considerando a fórmula AREA =
//(BASE*ALTURA)/2 .Utilize as variáveis AREA, BASE e ALTURA e os operadores
//aritméticos de multiplicação e divisão.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double area, base, altura;
        
        System.out.println("Para calcular a área de um triângulo, informe primeiro o valor da base: ");
        base = ler.nextDouble();
        System.out.println("Agora o valor da altura do triângulo: ");
        altura = ler.nextDouble();
        area = (base * altura)/2;
        System.out.println("O valor da área do triângulo é: " + area);
    }
    
}
