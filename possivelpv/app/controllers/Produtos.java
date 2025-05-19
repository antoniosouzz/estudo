package controllers;

import java.util.List;

import models.Produto;
import play.mvc.Controller;

public class Produtos extends Controller{
	
	public static void listar() {
		List<Produto> listadeprodutos = Produto.findAll();
		render(listadeprodutos);
	}
	
	public static void form() {
		render();
	}
		public static void salvar(Produto i) {
			if (i.nome != null) {
				i.nome = i.nome.toUpperCase();
		    }
			
			if (i.preco != null) {
				   String precoStr = i.preco.toString(); // ou formatar da forma que desejar
				   // depois use precoStr conforme necessário
				}
			
			i.save();
			listar();
		}
		
		public static void remover(long id) {
			Produto produto = Produto.findById(id);
			produto.delete();
			listar();
		}
		
	}

// não esquecer de criar um folder dentro de views com o nome do controlador
	

