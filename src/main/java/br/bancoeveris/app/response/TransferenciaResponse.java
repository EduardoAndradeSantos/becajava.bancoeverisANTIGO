package br.bancoeveris.app.response;

import br.bancoeveris.app.model.BaseResponse;

public class TransferenciaResponse extends BaseResponse {
	private Long id;
	private String hashOrigem;
	private String hashDestino;
	private Double valor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHashOrigem() {
		return hashOrigem;
	}
	public void setHashOrigem(String hashOrigem) {
		this.hashOrigem = hashOrigem;
	}
	public String getHashDestino() {
		return hashDestino;
	}
	public void setHashDestino(String hashDestino) {
		this.hashDestino = hashDestino;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
		
}
