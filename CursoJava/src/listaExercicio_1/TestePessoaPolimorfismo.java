package listaExercicio_1;

public class TestePessoaPolimorfismo {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(
			"NomePessoa", 
			"SobrenomePessoa", 
			"ApelidoPessoa",
			20,
			(char) 'm');
		pessoa1.informacaoPessoa();
		pessoa1.setNome("NovoNome");
		pessoa1.setSobrenome("NovoSobrenome");
		pessoa1.setIdade(20);
		pessoa1.setSexo((char) 'f');
		pessoa1.informacaoPessoa();
		
		PessoaFisica pessoa2 = new PessoaFisica(
			"123123123",
			"NomePessoa", 
			"SobrenomePessoa", 
			"ApelidoPessoa",
			20,
			(char) 'm');
		pessoa2.informacaoPessoaFisica();
		
		PessoaJuridica pessoa3 = new PessoaJuridica(
			"555443322",
			"NomePessoa", 
			"SobrenomePessoa", 
			"ApelidoPessoa",
			45,
			(char) 'm');
		pessoa3.informacaoPessoaJuridica();
		
		FuncionarioColaborador pessoa4 = new FuncionarioColaborador(
			"77778888",
			"NomePessoa", 
			"SobrenomePessoa", 
			"ApelidoPessoa",
			23,
			(char) 'm',
			45.01);
		pessoa4.informacaoFuncionarioColaborador();
		
		FuncionarioJuridico pessoa5 = new FuncionarioJuridico(
			"1414141414",
			"NomePessoa", 
			"SobrenomePessoa", 
			"ApelidoPessoa",
			24,
			(char) 'm',
			55.01,
			"Departamento");
		pessoa5.informacaoFuncionarioJuridico();
		
		Funcionario pessoa6 = new Funcionario(
			55.01,
			"NomePessoa", 
			"SobrenomePessoa", 
			"ApelidoPessoa",
			27,
			(char) 'f');
		pessoa6.informacaoPessoa();
		
		Gerente pessoa7 = new Gerente(
			55.01,
			"98989899",
			"NomePessoa", 
			"SobrenomePessoa", 
			"ApelidoPessoa",
			28,
			(char) 'f',
			"departamentoFinal");
		pessoa7.informacaoPessoaGerente();
				
	}
}