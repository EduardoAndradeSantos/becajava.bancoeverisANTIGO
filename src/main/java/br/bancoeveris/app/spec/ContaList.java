package br.bancoeveris.app.spec;

import br.bancoeveris.app.model.BaseResponse;

import java.util.List;

import br.bancoeveris.app.model.*;

public class ContaList extends BaseResponse {
	
	//PROPRIEDADES
	private List<Conta> Contas;
	
	//CONSTRUTOR
	public List<Conta> getContas(){
		return Contas;
	}
	
	//METODO
	public void setContas(List<Conta> contas) {
		Contas = contas;
	}
}