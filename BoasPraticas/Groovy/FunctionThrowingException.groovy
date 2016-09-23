class AlunoController {

	def alunoService

	def removerAluno(Long idAluno) {
		try {
			alunoService.removerAlunoPeloId(idAluno)
			renderizeSucesso('Aluno removido com sucesso')
		} catch (AlunoNaoEncontradoException e) {
			renderizeMensagemErro(e.mensagem)
		}
	}
}

class AlunoService {

	void removerAlunoPeloId(Long idAluno) {
		Aluno alunoEncontrado = getAlunoPeloId(idAluno)
		if (alunoEncontrado) {
			excluirAluno(alunoEncontrado)
		} else {
			throw new AlunoNaoEncontradoException('O aluno não foi encontrado.')
		}
	}

	Aluno getAlunoPeloId(Long idAluno) {
		Aluno.get(idAluno)
	}

	private static void excluirAluno(Aluno alunoParaExcluir) {
		alunoParaExcluir.delete()
	}
}
