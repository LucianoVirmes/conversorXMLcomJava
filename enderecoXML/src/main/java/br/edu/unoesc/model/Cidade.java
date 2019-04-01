package br.edu.unoesc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cidade {
	@XmlElement(name = "nome", required= true)
	private String nome;
	@XmlElement
	private UF uf;

	public Cidade() {
	}
	public Cidade(String nome, UF uf) {
		super();
		this.nome = nome;
		this.uf = uf;
	}
	public String getNome() {
		return nome;
	}
	public UF getUf() {
		return uf;
	}
	@Override
	public String toString() {
		return "Cidade [nome=" + nome + ", uf=" + uf + "]";
	}
	
	
	
}
