package br.edu.unoesc.main;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import br.edu.unoesc.model.Cidade;
import br.edu.unoesc.model.Endereco;
import br.edu.unoesc.model.UF;

public class Main {

	public static void main(String[] args) {
		UF uf = new UF("sc");
		Cidade cidade = new Cidade("Xanxerê", uf);
		Endereco endereco = new Endereco(cidade);
		
		try {
			//convertendo obj em xml
			JAXBContext jaxbContext =  JAXBContext.newInstance(Endereco.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(endereco, new File("endereco.xml"));
			//convertendo xml em obj
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Endereco endereco2 = (Endereco) unmarshaller.unmarshal(new File("endereco.xml"));
			
			System.out.println(endereco2.toString());
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
