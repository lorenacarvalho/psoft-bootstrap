import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer, Pessoa> pessoas = new HashMap<>();
    static int proximoIdPessoa = 0;

    static Pessoa createPessoa(String nome, String cpf, int idade, String profissao, String telefone, Papel cargo) {
        Pessoa p = new Pessoa(proximoIdPessoa++, nome, cpf, idade, profissao, telefone, cargo);
        pessoas.put(p.getIdPessoa(), p);
        return p;
    }

    static Pessoa read(int idPessoa){
        return pessoas.get(idPessoa);
    }

    static void updatePessoa(int id, int idade, String profissao, String telefone, Papel cargo){
        Pessoa p = read(id);
        if (p == null)
            return;
        p.setIdade(idade);
        p.setProfissao(profissao);
        p.setCargo(cargo);
        p.setTelefone(telefone);
    }

    static void deletePessoa(int id){
        pessoas.remove(id);
    }

    public static void main(String[] args) {
        //CREATE
        Pessoa maria = createPessoa("Maria", "30", 111, "9999-9999", "Engenheira", Papel.CLIENTE);
        maria.adicionaEndereco(new Endereco("Rua das Flores", "Centro", "Campina Grande", 100));
        maria.adicionaEndereco(new Endereco("Av. Brasil", "Prata", "Campina Grande", 200));

        createPessoa("Joao", "222", 25, "Professor", "8888-8888", Papel.FUNCIONARIO);

        //READ (lista todas)
        System.out.println("--- Lista ---");
        for (Pessoa p : pessoas.values()) System.out.println(p);

        //UPDATE dos dados da pessoa 1
        updatePessoa(1, 31, "Arquiteta", "7777.7777", Papel.FUNCIONARIO);

        //adiciona um novo endereco a pessoa 1 (mantendo os antigos)
        maria.adicionaEndereco(new Endereco("Rua Nova", "Bela Vista", "Campina Grande", 50));

        //atualiza o primeiro endereco (posicao 0) da pessoa 1
        maria.atualizaEndereco(0, new Endereco("Rua Corrigida", "Centro", "Campina Grande", 123));

        System.out.println("\n--- Apos atualizar #1 ---");
        System.out.println(read(1));

        //DELETE (remove a pessoa 2)
        deletePessoa(2);
        System.out.println("\n--- Apos remover #2 ---");
        for (Pessoa p : pessoas.values()) System.out.println(p);
    }

}
