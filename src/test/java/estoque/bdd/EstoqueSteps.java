package estoque.bdd;

import estoque.Produto;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import static org.junit.jupiter.api.Assertions.*;

public class EstoqueSteps {

    private Produto produto;
    private boolean resultadoRetirada;

    @Dado("um produto {string} com {int} unidades em estoque")
    public void umProdutoComUnidades(String nome, int qtd) {
        produto = new Produto(nome, qtd);
    }

    @Quando("eu adiciono {int} unidades")
    public void euAdiciono(int qtd) {
        produto.adicionar(qtd);
    }

    @Quando("eu retiro {int} unidades")
    public void euRetiro(int qtd) {
        resultadoRetirada = produto.retirar(qtd);
    }

    @Então("o saldo deve ser {int} unidades")
    public void oSaldoDeveSer(int esperado) {
        assertEquals(esperado, produto.getSaldo());
    }

    @Então("a retirada deve ser aceita")
    public void retiradaAceita() {
        assertTrue(resultadoRetirada);
    }

    @Então("a retirada deve ser recusada")
    public void retiradaRecusada() {
        assertFalse(resultadoRetirada);
    }
}