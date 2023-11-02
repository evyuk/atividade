package praticaula;

import java.util.Scanner;

public class PraticAula {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, total;
        System.out.println("Primeiro valor:");
        n1 = ler.nextInt();
        System.out.println("Segundo valor:");
        n2 = ler.nextInt();
        total = n1 + n2;
        System.out.println("Resultado da soma:" + total);
    }

}
