package application;

import entities.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        ContaBanco contaBanco = new ContaBanco();
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        contaBanco.setAgencia(sc.nextLine());

        System.out.println("Por favor, digite o número da conta!");
        contaBanco.setNumero(sc.nextInt());

        System.out.println("Por favor, informe o nome do cliente!");
        contaBanco.setNomeCliente(sc.nextLine());
        sc.nextLine();

        System.out.println("Por favor, informe o saldo da conta!");
        contaBanco.setSaldo(sc.nextDouble());

        System.out.println("================================================================================");
        System.out.println();
        System.out.println(contaBanco.toString());

        sc.close();
    }
}
