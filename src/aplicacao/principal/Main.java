package aplicacao.principal;

import aplicacao.modelos.CartaoCredito;
import aplicacao.modelos.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;

        System.out.println("Digite o limite do cartão: ");
        double limiteInput = scanner.nextDouble();

        CartaoCredito cartao = new CartaoCredito(limiteInput);

        while(opcao != 0){
            System.out.println("Descrição da compra: ");
            String descricaoInput = scanner.next();
            System.out.println("Digite o valor da compra: ");
            double valorInput = scanner.nextDouble();

            Compra compra = new Compra(descricaoInput,valorInput);

            boolean compraRealizada = cartao.registrarCompra(compra);
            if(compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar!");
                opcao = scanner.nextInt();
            }else{
                System.out.println("Saldo insuficiente!");
                opcao = 0;
            }
        }


        Collections.sort(cartao.getListaCompras());
        System.out.println("COMPRAS REALIZADAS");
        for (Compra item: cartao.getListaCompras()) {
            System.out.println("\n"+item);
        }

        System.out.println("\nSaldo do cartão: " + cartao.getSaldo());







    }
}
