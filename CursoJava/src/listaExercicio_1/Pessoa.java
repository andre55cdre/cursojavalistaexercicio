package listaExercicio_1;

class Pessoa {
	private String nome, sobrenome;
	private String apelido;
	private int idade;
	private char sexo;
	
	public Pessoa(
		String nome,
		String sobrenome,
		String apelido,
		int idade,
		char sexo
	) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.apelido = apelido;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}	
	public void informacaoPessoa() {
		System.out.println("-- informacaoPessoa -- \n");
		System.out.println("Nome: " + this.nome);
		System.out.println("Sobrenome: " + this.sobrenome);
		System.out.println("Apelido: " + this.apelido);
		System.out.println("Idade: " + this.idade);
		System.out.println("Sexo: " + this.sexo);
	}
}

class PessoaFisica extends Pessoa {
	private	String cpf;
	
	public PessoaFisica (
		String cpf,
		String nome,
		String sobrenome,
		String apelido,
		int idade,
		char sexo		
	) {
		super(nome, sobrenome, apelido, idade, sexo);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void informacaoPessoaFisica() {
		this.informacaoPessoa();
		System.out.println("-- PessoaFisica -- \n");
		System.out.println("CPF: " + this.cpf);
	}
}

class PessoaJuridica extends Pessoa {
	private	String cnpj;
	
	public PessoaJuridica (
		String cnpj,
		String nome,
		String sobrenome,
		String apelido,
		int idade,
		char sexo		
	) {
		super(nome, sobrenome, apelido, idade, sexo);
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCpf(String cnpj) {
		this.cnpj = cnpj;
	}
	public void informacaoPessoaJuridica() {
		this.informacaoPessoa();
		System.out.println("-- PessoaJuridica -- \n");
		System.out.println("CNPJ: " + this.cnpj);
	}
}

class FuncionarioColaborador extends PessoaFisica {
	private	double salario;
	
	public FuncionarioColaborador (
		String cpf,
		String nome,
		String sobrenome,
		String apelido,
		int idade,
		char sexo,
		double salario
	) {
		super(cpf, nome, sobrenome, apelido, idade, sexo);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void informacaoFuncionarioColaborador() {
		this.informacaoPessoaFisica();
		System.out.println("-- FuncionarioColaborador -- \n");
		System.out.println("Salário: " + this.salario);
	}
}

class FuncionarioJuridico extends PessoaJuridica {
	private	double salario;
	private	String departamento;
	
	public FuncionarioJuridico (
		String cnpj,
		String nome,
		String sobrenome,
		String apelido,
		int idade,
		char sexo,
		double salario,
		String departamento
	) {
		super(cnpj, nome, sobrenome, apelido, idade, sexo);
		this.salario = salario;
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public void informacaoFuncionarioJuridico() {
		this.informacaoPessoaJuridica();
		System.out.println("-- FuncionarioJuridico -- \n");
		System.out.println("Salário: " + this.salario);
		System.out.println("Departamento: " + this.departamento);
	}
}

class Funcionario extends Pessoa {
	private	double salario;
	
	public Funcionario (
		double salario,
		String nome,
		String sobrenome,
		String apelido,
		int idade,
		char sexo		
	) {
		super(nome, sobrenome, apelido, idade, sexo);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void informacaoFuncionario() {
		this.informacaoPessoa();
		System.out.println("-- Funcionario -- \n");
		System.out.println("Salário: " + this.salario);
	}
}

class Gerente extends Funcionario {
	private	String departamento;
	
	public Gerente (
		double salario,
		String cnpj,
		String nome,
		String sobrenome,
		String apelido,
		int idade,
		char sexo,
		String departamento
	) {
		super(salario, nome, sobrenome, apelido, idade, sexo);
		
		this.departamento = departamento;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public void informacaoPessoaGerente() {
		this.informacaoPessoa();
		System.out.println("-- Gerente -- \n");
		System.out.println("Departamento: " + this.departamento);
	}
}
