package br.edu.unoesc.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Endereco {
	@XmlElement
	private Cidade cidade;

	
	public Endereco() {

	}
	
	public Endereco(Cidade cidade) {
		super();
		this.cidade = cidade;
	}

	public void setCidade(Cidade cidade) {
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
