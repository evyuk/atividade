package praticaulal2iii;
import java.util.Scanner;

public class PraticAulaL2III {

    //A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de
//broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono
//quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar
//numa conta de poupança (10% do total arrecadado). Você foi contratado para fazer os cálculos
//para o dono. Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de
//broas, e depois calcular os dados solicitados.
    
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double pãozinho, broa, total, poupança;
    System.out.println("O número de pãozinhos vendidos no dia foram: ");
    pãozinho = ler.nextDouble();
    System.out.println("O número de broas vendidos no dia foram: ");
    broa = ler.nextDouble();
    total = (pãozinho * 0.12) + (broa * 1.50);
    poupança = total * 0.10;
    System.out.println("O valor total arrecadado no dia da vendas dos pãozinhos e das broas, é: " + total + ". E o valor para ser depositado na conta poupança é: " + poupança);
    
            
    }
    
}
