class AlunoController {

	def alunoService

	def removerAluno(Long idAluno) {
		int resultado = alunoService.removerAlunoPeloId(idAluno)

		if (resultado == AlunoService.CODIGO_ALUNO_NAO_ENCONTRADO) {
			renderizeMensagemErro('O aluno não foi encontrado.')
		} else {
			renderizeSucesso('Aluno removido com sucesso')
		}
	}
}

class AlunoService {

	public static int CODIGO_ALUNO_NAO_ENCONTRADO = 404
	public static int CODIGO_DELETOU_COM_SUCESSO = 200

	int removerAlunoPeloId(Long idAluno) {
		Aluno alunoEncontrado = getAlunoPeloId(idAluno)
		if (alunoEncontrado) {
			return CODIGO_ALUNO_NAO_ENCONTRADO
		}
		excluirAluno(alunoEncontrado)
	}

	Aluno getAlunoPeloId(Long idAluno) {
		Aluno.get(idAluno)
	}

	private static int excluirAluno(Aluno alunoParaExcluir) {
		alunoParaExcluir.delete()
		return CODIGO_DELETOU_COM_SUCESSO
	}
}
