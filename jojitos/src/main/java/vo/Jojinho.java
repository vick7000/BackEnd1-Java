package vo;

import java.util.Objects;

public class Jojinho {

	private String nome;
	private String midia;
	private String classificacao;
	private String genero;
	private String lancamento;
	
	public Jojinho(String nome, String midia, String classificacao, String genero, String lancamento) {
		super();
		this.nome = nome;
		this.midia = midia;
		this.classificacao = classificacao;
		this.genero = genero;
		this.lancamento = lancamento;
	}

	public Jojinho() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome,classificacao, genero, lancamento, midia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jojinho other = (Jojinho) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(classificacao, other.classificacao) && Objects.equals(genero, other.genero)
				&& Objects.equals(lancamento, other.lancamento) && Objects.equals(midia, other.midia);
	}

	@Override
	public String toString() {
		return nome + "\t" + midia + "\t" + classificacao + "\t" + genero + "\t" + lancamento +"\n";
	}
	
	public String toCSV() {
		return nome + ";" +midia + ";" + classificacao + ";" + genero + ";" + lancamento + "/r/n";
	}
	public String toHTML() {
		return "</td><td>"+ nome + "</td><td>" + midia + "</td><td>" + classificacao + "</td><td>" + genero + "</td><td>" + lancamento + "</td><td>";
	}
	
}
