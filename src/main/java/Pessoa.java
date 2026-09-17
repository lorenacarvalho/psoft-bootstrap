import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private String cpf;
    private int idade;
    private String profissao;
    private String telefone; //coloquei String considerando o formato padrão separado por " - "
    private List<Endereco> enderecos = new ArrayList<>();
    private Papel cargo;

    public Pessoa(int idPessoa, String nome, String cpf, int idade, String profissao, String telefone, Papel cargo) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.profissao = profissao;
        this.telefone = telefone;
        this.cargo = cargo;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void adicionaEndereco(Endereco endereco){
        this.enderecos.add(endereco);
    }

    public void atualizaEndereco(int indice, Endereco enderecoNovo){
        if (indice >= 0 && indice <this.enderecos.size()){
            this.enderecos.set(indice, enderecoNovo);
        }
    }
    public Papel getCargo() {
        return cargo;
    }

    public void setCargo(Papel cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Pessoa #" + idPessoa + ", nome:" + nome + ", cpf:" + cpf + ", idade:" + idade + ", profissao:"
                + profissao + ", telefone:" + telefone + ", enderecos:" + enderecos + ", cargo:" + cargo;
    }



}
