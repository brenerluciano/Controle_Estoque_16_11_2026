package estoque;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTeste {

    @Test
    void deveAdicionarUnidadesAoEstoque() {
        Produto p = new Produto("Caneta", 10);
        p.adicionar(5);
        assertEquals(15, p.getSaldo());
    }

    @Test
    void deveRetirarQuandoHaSaldoSuficiente() {
        Produto p = new Produto("Caneta", 10);
        assertTrue(p.retirar(4));
        assertEquals(6, p.getSaldo());
    }

    @Test
    void deveRecusarRetiradaMaiorQueOSaldo() {
        Produto p = new Produto("Caneta", 10);
        assertFalse(p.retirar(15));
        assertEquals(10, p.getSaldo()); // saldo não muda
    }
}