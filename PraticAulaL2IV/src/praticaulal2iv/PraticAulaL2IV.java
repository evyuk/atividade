package praticaulal2iv;
import java.util.Scanner;

public class PraticAulaL2IV {

    //Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de
//vida ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma
//pessoa com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ
//VIVEU 6935 DIAS
    
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String nome;
    int diaV, anos;
        System.out.println("Qual o seu nome? ");
        nome = ler.next();
        System.out.println("Qual a sua idade? ");
        anos = ler.nextInt();
        diaV = anos * 365;
        System.out.println(nome + ", você já viveu " + diaV + " dias!");
        
            
    }
    
}
