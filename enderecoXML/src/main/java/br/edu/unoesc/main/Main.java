package br.edu.unoesc.main;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import br.edu.unoesc.conversor.ConverterXML;
import br.edu.unoesc.model.Cidade;
import br.edu.unoesc.model.Endereco;
import br.edu.unoesc.model.UF;

public class Main {

	public static void main(String[] args) {
		UF uf = new UF("sc");
		Cidade cidade = new Cidade("Xanxerê", uf);
		Endereco endereco = new Endereco(cidade);

		ConverterXML<Endereco> conversor = new ConverterXML<>(Endereco.class);
		
		conversor.gerarXml(new File("endereco.xml"), endereco);
		
		Endereco en = conversor.gerarObj(new File("endereco.xml"));
		
		System.out.println(en.toString());
	}
}
