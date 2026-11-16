package estoque;

public class Produto {

    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Entrada de produtos
    public void adicionar(int unidades) {
        if (unidades <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        quantidade += unidades;
    }

    // Saída: retorna false e não altera o saldo se não houver estoque suficiente
    public boolean retirar(int unidades) {
        if (unidades <= 0 || unidades > quantidade) {
            return false;
        }
        quantidade -= unidades;
        return true;
    }

    public int getSaldo() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }
}