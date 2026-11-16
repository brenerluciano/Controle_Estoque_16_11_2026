package estoque;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Caneta", 10);
        System.out.println("Saldo inicial: " + p.getSaldo());

        p.adicionar(5);
        System.out.println("Após entrada de 5: " + p.getSaldo());

        boolean ok = p.retirar(8);
        System.out.println("Retirada de 8 aceita? " + ok + " | Saldo: " + p.getSaldo());

        ok = p.retirar(20);
        System.out.println("Retirada de 20 aceita? " + ok + " | Saldo: " + p.getSaldo());
    }
}