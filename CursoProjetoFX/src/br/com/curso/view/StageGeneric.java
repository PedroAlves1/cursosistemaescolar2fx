package br.com.curso.view;

import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 * Esta classe é uma "Stage" Genérica. Para utilizála crie o objeto 
 * passando como parâmetro o nome do arquivo a ser carregado.
 * Dentro do Stage criado, sempre haverá um AnchorPane.
 * 
 * @author Marcelo
 *
 */
public class StageGeneric extends Stage {
	
	private String arquivo;
	private int largura;
	private int altura;
	
	private Object previousController;
	
	/**
	 * Construtor
	 * 
	 * @param arquivo Nome do arquivo FXML
	 */
	public StageGeneric(String arquivo) {
		this.arquivo = arquivo;
	}
	
	
	/**
	 * Este método configura o AnchorPane, recebido do arquivo fxml, 
	 * configura a Scene, com a largura e altura passada, e mostra a janela.
	 * 
	 */
	public void init() {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource(this.arquivo));
			Scene scene = new Scene(root, this.largura, this.altura);
			this.setScene(scene);
			this.show();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	//Getters and Setters
	
	public String getArquivo() {
		return arquivo;
	}


	public int getLargura() {
		return largura;
	}


	public void setLargura(int largura) {
		this.largura = largura;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public Object getPreviousController() {
		return previousController;
	}


	public void setPreviousController(Object previousController) {
		this.previousController = previousController;
	}


	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	
	
	
}
