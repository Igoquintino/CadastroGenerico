package Igoquintino.github.CadastroDeGenericos.Genericos;

import Igoquintino.github.CadastroDeGenericos.Atividades.AtividadeModel;
import jakarta.persistence.*;

import java.util.List;

// Entity ele tranforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
public class GenericoModel {

    @Id // mostra que o proximo, no caso Log id é um id da entidade que vai ser tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerar id automatico e usar uma estrategia para isso
    private Long id;

    private String nome;

    private String email;

    private int idade;

    // @ManyToOne uma generico tem uma unica atividade
    @ManyToOne
    @JoinColumn(name = "atividades_id") // Foreing key ou chave estrageira
    private AtividadeModel atividadeModel;

    public GenericoModel() {
    }

    public GenericoModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "GenericoModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                '}';
    }
}
