package br.edu.unoesc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UF {
	@XmlElement
	private String nome;

	public UF() {
		
	}
	public String getNome() {
		return nome;
	}

	public UF(String nome) {
		super();
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "UF [nome=" + nome + "]";
	}
	
	

}
