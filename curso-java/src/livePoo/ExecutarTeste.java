package livePoo;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		Venda venda1 = new Venda(1L, "Consoles videogames", "Ítalo", "Castanhal/PA");
		Produto produto1 = new Produto(1L, "Nintendo Switch", BigDecimal.valueOf(1999.99));
		Produto produto2 = new Produto(2L, "PlayStation 5", BigDecimal.valueOf(5999.99));
		Produto produto3 = new Produto(3L, "Xbox series X", BigDecimal.valueOf(3999.99));
		
		venda1.getListaProdutos().add(produto1);
		venda1.getListaProdutos().add(produto2);
		venda1.getListaProdutos().add(produto3);

		for (Produto produto : venda1.getListaProdutos()) {
			System.out.println(produto);
		}

		System.out.println("Descrição da venda: " + venda1.getDescricaoVenda() + ", total: " + venda1.getValorTotal());
	}
}