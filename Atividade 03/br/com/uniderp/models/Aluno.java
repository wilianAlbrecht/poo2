import java.time.LocalDate;

public class Aluno extends BasePessoa {
    
    private String matricula;
    private LocalDate dataDaMatricula;
    
    // getters and setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataDaMatricula() {
        return dataDaMatricula;
    }
    public void setDataDaMatricula(LocalDate dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }

    //constructor
    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsercao, String matricula, LocalDate dataDaMatricula) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.matricula = matricula;
        this.dataDaMatricula = dataDaMatricula;
    }
    
    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsercao) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
    }
    
}
