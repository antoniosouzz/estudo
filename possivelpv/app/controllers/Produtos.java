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
			if(i.preco != 0){
				i.preco = i.preco; //Double com "D" maiusulo permite nulo / double com "d" premite nulo
			}
			if(i.quantidade != null) {
				i.quantidade = i.quantidade;  //integer permite o nulo
			}
			if(i.categoria != null) {
				i.categoria = i.categoria;
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
	

