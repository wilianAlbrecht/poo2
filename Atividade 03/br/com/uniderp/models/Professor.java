import java.time.LocalDate;

public class Professor extends BasePessoa {
    
    private String registro;
    private LocalDate dataDeContratacao;

    // getters and setters
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public LocalDate getDataDeContratacao() {
        return dataDeContratacao;
    }
    public void setDataDeContratacao(LocalDate dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }
    
    //constructor
    public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsercao, String registro, LocalDate dataDeContratacao) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.registro = registro;
        this.dataDeContratacao = dataDeContratacao;
    }

    public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsercao) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
    }
    

}
