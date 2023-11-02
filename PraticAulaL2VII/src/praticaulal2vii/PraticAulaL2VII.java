package praticaulal2vii;
import java.util.Scanner;

public class PraticAulaL2VII {

    //Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o início do
//ano. Esqueça a questão dos anos bissextos e considere sempre que um mês possui 30 dias.
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int mes, dia, diasP;
        
        System.out.println("Informe um dia (1 a 30)");
        dia = ler.nextInt();
        System.out.println("Informe um mês (1 a 12):");
        mes = ler.nextInt();
        diasP = (mes - 1) * 30 + dia;
        System.out.println("Se passaram " + diasP + " dias desde o início do ano.");
    }
    
}
