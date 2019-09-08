package br.com.opet.model;

import javax.inject.Named;

import br.com.opet.dao.AlunoDAO;

@Named("aluno")
public class Aluno extends AlunoDAO{
	private int RA;
	private String nome;
	private String email;
	private String endereco;
	private float n1;
	private float n2;
	private float n3;
	private float media;
	
	public Aluno() {
		
	}
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public float getN1() {
		return n1;
	}
	public void setN1(float n1) {
		this.n1 = n1;
	}
	public float getN2() {
		return n2;
	}
	public void setN2(float n2) {
		this.n2 = n2;
	}
	public float getN3() {
		return n3;
	}
	public void setN3(float n3) {
		this.n3 = n3;
	}
	public float getMedia() {
		media = (n1 + n2 + n3) / 3;
		return media;
	}
	public void salvar() {
		super.salvar(this);
	}
}
