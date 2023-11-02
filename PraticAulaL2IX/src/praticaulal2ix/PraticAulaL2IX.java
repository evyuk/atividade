package praticaulal2ix;
import java.util.Scanner;

public class PraticAulaL2IX {

    //Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
//vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário
//forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a
//máquina informe quanto será o valor arrecadado.

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int peq, med, grd, valorA;
        
        System.out.println("Informe o número de camisetas do tamanho P:");
        peq = ler.nextInt();
        System.out.println("Informe o número de camisetas do tamanho M:");
        med = ler.nextInt();
        System.out.println("Informe o número de camisetas do tamanho G:");
        grd = ler.nextInt();
        valorA = (peq * 10) + (med * 12) + (grd * 15);
        System.out.println("O valor total a ser arrecado é de: R$" + valorA);
    }
    
}
