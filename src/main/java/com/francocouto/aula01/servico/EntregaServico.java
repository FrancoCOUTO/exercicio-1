package com.francocouto.aula01.servico;

import org.springframework.stereotype.Service;

import com.francocouto.aula01.entidades.Pedido;

@Service
public interface EntregaServico {

	public Double taxaEntrega(Pedido pedido);
		
	

}
