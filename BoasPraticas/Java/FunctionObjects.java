class Aluno{
	private string nome;
	private string sobrenome;
	private Date dataNascimento;
	private string escolaridade;	
}

class FunctionObjects {
	
	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		java.sql.Date data = new java.sql.Date(format.parse("06/11/1992").getTime());

		Aluno aluno = new Aluno;
		aluno.setNome("Marcos Vinicius");
		aluno.setSobrenome("Ribeiro Silva");
		aluno.setDataNascimento(data);
		aluno.setEscolaridade("Superior Incompleto");
		
		persistirAluno(aluno);
	}
	
	public static void persistirAluno(Aluno aluno){
		GravarNome(aluno.getNome);
		GravarSobreNome(aluno.getSobrenome);
		GravarDataNascimento(aluno.getDataNascimento);
		GravarEscolaridade(aluno.getEscolaridade);
	}
}