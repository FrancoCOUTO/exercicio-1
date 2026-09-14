package com.francocouto.aula01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.francocouto.aula01.entidades.Pedido;


import com.francocouto.aula01.servico.PedidoServico;

@SpringBootApplication
public class Aula01Application implements CommandLineRunner {
	
	@Autowired
	PedidoServico servico;

	public static void main(String[] args) {
		SpringApplication.run(Aula01Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Pedido pedido = new Pedido(1034, 150.0, 20.0);
		System.out.println("Codigo do pedido:" + pedido.getCodigo());
		 System.out.println("Valor total: R$ " + servico.total(pedido));
		
		
	}

}
 