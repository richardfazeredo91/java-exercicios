package model;

public class Aluno {
	
	private int idaluno;
	private String nome;
	private String telefone;
	private String email;
	private String cpf;
	private String rg;
	private String cep;
	private int numero;
	private String complemento;
	private String datanasc;
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(int idaluno, String nome, String telefone, String email, String cpf, String rg, String cep, int numero,
			String complemento, String datanasc) {
		super();
		this.idaluno = idaluno;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
		this.datanasc = datanasc;
	}

	public int getIdaluno() {
		return idaluno;
	}

	public void setIdaluno(int idaluno) {
		this.idaluno = idaluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	
	

}
