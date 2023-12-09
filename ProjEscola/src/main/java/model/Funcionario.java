package model;

public class Funcionario {
	private int idfunc;
	private String nome;
	private String telefone;
	private String email;
	private String cpf;
	private String rg;
	private String cargo;
	private String usuario;
	private String senha;

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(int idfunc, String nome, String telefone, String email, String cpf, String rg, String cargo,
			String usuario, String senha) {
		super();
		this.idfunc = idfunc;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		this.cargo = cargo;
		this.usuario = usuario;
		this.senha = senha;
	}

	public int getIdfunc() {
		return idfunc;
	}

	public void setIdfunc(int idfunc) {
		this.idfunc = idfunc;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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

}
