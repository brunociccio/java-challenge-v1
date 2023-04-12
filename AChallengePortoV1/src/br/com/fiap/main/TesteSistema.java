package br.com.fiap.main;

import br.com.fiap.beans.Bicicleta;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Contatos;
import br.com.fiap.beans.Documentos;
import br.com.fiap.beans.Endereço;
import br.com.fiap.beans.Modalidade;
import br.com.fiap.beans.Seguros;
import br.com.fiap.beans.Sistema;

public class TesteSistema {

	public static void main(String[] args) {
		// intanciando os objetos
		Sistema objSistema = new Sistema();
		Cliente objCliente = new Cliente();
		Endereço objEndereço = new Endereço();
		Documentos objDocumentos = new Documentos();
		Contatos objContatos = new Contatos();
		Modalidade objModalidade = new Modalidade();
		Bicicleta objBicicleta = new Bicicleta();
		Seguros objSeguros = new Seguros();
		
		objSistema.setCliente(objCliente);
		objSistema.setEndereço(objEndereço);
		objSistema.setDocumentos(objDocumentos);
		objSistema.setContatos(objContatos);
		objSistema.setModalidade(objModalidade);
		objSistema.setBicicleta(objBicicleta);
		objSistema.setSeguros(objSeguros);
		
		System.out.println();

	}

}
