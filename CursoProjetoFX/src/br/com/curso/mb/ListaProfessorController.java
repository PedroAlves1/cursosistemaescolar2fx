package br.com.curso.mb;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import br.com.curso.model.Professor;
import br.com.curso.view.StageGeneric;

public class ListaProfessorController implements Initializable {
     
    
	@FXML
	private AnchorPane root;
    @FXML
    TableView<Professor> tabelaProfessor;
 
    @FXML
    TableColumn<Professor,String> nome;
    @FXML
    TableColumn<Professor,String> disciplina;
    @FXML
    TableColumn<Professor,String> usuario;
 
    ObservableList<Professor> data;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
    	
        nome.setCellValueFactory(new PropertyValueFactory<Professor,String>("nome"));
        disciplina.setCellValueFactory(new PropertyValueFactory<Professor,String>("nomeDisciplina"));
        usuario.setCellValueFactory(new PropertyValueFactory<Professor,String>("usuario"));
 
        data = FXCollections.observableArrayList();
        tabelaProfessor.setItems(data);
    }    
 
    @FXML
    private void adicionaAction(ActionEvent event) {
    	StageGeneric stage = new StageGeneric("/br/com/curso/view/professor_cadastra.fxml");
    	stage.setLargura(315);
    	stage.setAltura(190);
    	stage.setPreviousController(this);
    	stage.init();
    }
    
    @FXML 
	 private void apagaAction(ActionEvent event) { 

       //Seleciona a linha 
       int selectedIndex = tabelaProfessor.getSelectionModel().getSelectedIndex(); 
       
       //Pega o registro 
       Professor p = tabelaProfessor.getItems().get(selectedIndex); 
       
       //Apaga a linha 
       tabelaProfessor.getItems().remove(selectedIndex); 
       System.out.println(p.getNome()); 
    }

	public ObservableList<Professor> getData() {
		return data;
	}

	public void setData(ObservableList<Professor> data) {
		this.data = data;
	} 	    
    
}