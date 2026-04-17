package Igoquintino.github.CadastroDeGenericos.Genericos;

import Igoquintino.github.CadastroDeGenericos.Atividades.AtividadeModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Entity ele tranforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@Data // Getters e Setters
@NoArgsConstructor // construtor sem argumento
@AllArgsConstructor // construtor com todos argumentos
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
}
