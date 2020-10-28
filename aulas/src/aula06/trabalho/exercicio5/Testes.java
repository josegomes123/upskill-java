package aula06.trabalho.exercicio5;

public class Testes {
    // Testes ex 5
    public static void main(String[] args) {
        // Criei os cartões
        CreditCard cartao1 = new CreditCard("Joao Lopes", "123456789123", 11,2022, 2500);
        CreditCard cartao2 = new CreditCard("Sofia", "312456789123", 01,2021, 130);
        // Adiciono operações ao cartão 1 e testo o saldo
        cartao1.gastar(200, "Bilhete de Teatro");
        cartao1.gastar(150, "Headphones");
        cartao1.gastar(600, "Estadia em Hotel 5*");
        cartao1.gastar(20, "Restaurante");
        cartao1.gastar(35, "Compras Continente");
        System.out.println("O saldo do cartao1 é: "+ cartao1.saldo());
        //Obtenho talao da ultima compra
        System.out.println("Talão da ultima compra:");
        System.out.println(cartao1.obterTalao());
        // Historico das compras
        System.out.println("Historico das compras do Cartão 1:");
        cartao1.getMovimentos();
        // Pago credito e testo novamente o Saldo
        cartao1.pagarCredito(600);
        System.out.println("O saldo do cartao1 é: "+ cartao1.saldo());

        // Testo o cartao 2 com uma transaçao maior do que o maximo Credito disponivel
        System.out.println("Teste Compra Cartão 2:");
        cartao2.gastar(600,"Computador");
    }
}
