package br.com.curso.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class Aluno {
	
    private String nome;
    private Calendar dataNascimento;
    private String ra;
    private String sexo;
    private int anoLetivo;
    private int numero;
    private List <Disciplina> disciplinas;
    private Endereco endereco;
    private Classe classe;
    
    
    //Construtor
    public Aluno(){
    	disciplinas = new ArrayList<>();
    }   
        
    public void adicionaDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    
    //Getters and Setters
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexoMasculino() {
    	sexo = "Masculino";
    }

    public void setSexoFeminino() {
    	sexo = "Feminino";
    }
    
    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}