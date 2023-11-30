package livePoo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Venda {

	private Long id;
	private String descricaoVenda;
	private String nomeClient;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	private List<Produto> listaProdutos = new ArrayList<Produto>();

	public Venda() {
	}
	
	public Venda(Long id, String descricaoVenda, String nomeClient, String enderecoEntrega) {
		this.id = id;
		this.descricaoVenda = descricaoVenda;
		this.nomeClient = nomeClient;
		this.enderecoEntrega = enderecoEntrega;
	}

	public Venda(Long id, String descricaoVenda, String nomeClient, String enderecoEntrega, BigDecimal valorTotal) {
		this.id = id;
		this.descricaoVenda = descricaoVenda;
		this.nomeClient = nomeClient;
		this.enderecoEntrega = enderecoEntrega;
		this.valorTotal = valorTotal;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	private double totalVenda() {
		double total = 0.0;
		
		for (Produto produto : this.getListaProdutos()) {
			total += produto.getValor().doubleValue();
		}
		
		this.valorTotal = BigDecimal.valueOf(total);

		return total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaoVenda() {
		return descricaoVenda;
	}

	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}

	public String getNomeClient() {
		return nomeClient;
	}

	public void setNomeClient(String nomeClient) {
		this.nomeClient = nomeClient;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public BigDecimal getValorTotal() {
		this.valorTotal = BigDecimal.valueOf(totalVenda());
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomeClient=" + nomeClient
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProdutos="
				+ listaProdutos + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		return Objects.equals(id, other.id);
	}
}