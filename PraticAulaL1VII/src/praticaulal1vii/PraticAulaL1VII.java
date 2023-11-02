package praticaulal1vii;
import java.util.Scanner;

public class PraticAulaL1VII {

    //Faça um algoritmo que:
    //Obtenha o valor para a variável HT (horas trabalhadas no mês);
    //Obtenha o valor para a variável VH (valor hora trabalhada):
    //Obtenha o valor para a variável PD (percentual de desconto);
    //Calcule o salário bruto =&gt; SB = HT * VH;
    //Calcule o total de desconto =&gt; TD = (PD/100)*SB;
    //Calcule o salário líquido =&gt; SL = SB – TD;
    //Apresente os valores de: Horas trabalhadas, Salário Bruto, Desconto, Salário Liquido.
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double horaT, valorHT, desconto, totalD, salBr, salLiq;
        
        System.out.println("Informe o número de horas trabalhadas no mês:");
        horaT = ler.nextDouble();
        System.out.println("Informe o valor por hora trabalhada:");
        valorHT = ler.nextDouble();
        System.out.println("Qual o percentual de desconto?");
        desconto = ler.nextDouble();
        salBr = horaT * valorHT;
        totalD = (desconto/100)*salBr;
        salLiq = salBr - totalD;
        System.out.println("O número de horas trabalhas no mês é " + horaT + ". O salário bruto é de " + salBr + ". O valor a ser descontado é de " + desconto + ". O valor do salário líquido é de " + salLiq);
        
        
    }
    
}
