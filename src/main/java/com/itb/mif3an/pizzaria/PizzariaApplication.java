package com.itb.mif3an.pizzaria;


import com.itb.mif3an.pizzaria.model.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzariaApplication.class, args);

		Produto p = new Produto();

		p.setNome("Pizza de calabreza tamanho 6");
		p.setPrecoCompra(-56.00);

		if (!p.validarProduto()) {
			System.out.println(p.getMensagemErro());
		}
	}

}
