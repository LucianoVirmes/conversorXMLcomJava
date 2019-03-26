package br.edu.unoesc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Endereco {
	@XmlElement
	private Cidade cidade;

	
	public Endereco() {

	}

	public Endereco(Cidade cidade) {
		super();
		this.cidade = cidade;
	}

	public Cidade getCidade() {
		return cidade;
	}

	@Override
	public String toString() {
		return "Endereco [cidade=" + cidade + "]";
	}

}
