package com.francocouto.aula01.servico;

import org.springframework.stereotype.Service;

import com.francocouto.aula01.entidades.Pedido;

@Service
public class Entrega {
	
	public Double taxaEntrega(Pedido pedido) {
	double total = 0.0;
	if (pedido.getvalor() <= 100) {
		total =  20;
	} else if (pedido.getvalor() > 100 && (pedido.getvalor() <= 200)) {
		total = 12;

	} else {
		total = 0.0;
	}

	return total;
	}
}
