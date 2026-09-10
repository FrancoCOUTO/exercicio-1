package com.francocouto.aula01.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.francocouto.aula01.entidades.Pedido;

@Service
public class PedidoServico {
	
	@Autowired
	Entrega entregaServico;
	
	
	
	public double total (Pedido pedido) {
		double total = 0.0;
		double desconto = pedido.getvalor() * (pedido.getDisconto() / 100);
		total = pedido.getvalor() - desconto + entregaServico.taxaEntrega(pedido);
		return total;
	}

}
