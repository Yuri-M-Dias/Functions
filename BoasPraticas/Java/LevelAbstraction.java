public class ModelProfessor {

    private String nome;
    private String sobrenome;
    private String matricula;
    private String instituto;

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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }
}

public class ControllerProfessor {

    public static void main(String[] args) {
        ModelProfessor professor = new ModelProfessor();
        professor.setNome("Joaquim");
        professor.setSobrenome("Oliveira");
        professor.setInstituto("Instituto de Informática");
        professor.setMatricula("123456");
    }
}