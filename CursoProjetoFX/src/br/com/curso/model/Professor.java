package br.com.curso.model;

/**
 * @author Marcelo
 */
public class Professor {
	
	private String nome;
	private String usuario;
	private String senha;
	private Disciplina disciplina;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public String getNomeDisciplina() {
		return disciplina.getNome();
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.disciplina.setNome(nomeDisciplina);
	}
	
	

}