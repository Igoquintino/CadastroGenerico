package Igoquintino.github.CadastroDeGenericos.Atividades;


import Igoquintino.github.CadastroDeGenericos.Genericos.GenericoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_atividade")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AtividadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAtividade;

    private String nivel;

    // @OneToMany Uma atividade pode ter varios genericos
    @OneToMany(mappedBy = "atividadeModel")
    private List<GenericoModel> genericoModelList;
}
