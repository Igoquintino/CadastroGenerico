package Igoquintino.github.CadastroDeGenericos.Atividades;


import Igoquintino.github.CadastroDeGenericos.Genericos.GenericoModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_atividade")
public class AtividadeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAtividade;

    private String nivel;

    // @OneToMany Uma atividade pode ter varios genericos
    @OneToMany(mappedBy = "atividadeModel")
    private List<GenericoModel> genericoModelList;


    public AtividadeModel() {
    }

    public AtividadeModel(Long id, String nomeAtividade, String nivel) {
        this.id = id;
        this.nomeAtividade = nomeAtividade;
        this.nivel = nivel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAtividade() {
        return nomeAtividade;
    }

    public void setAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    @Override
    public String toString() {
        return "AtividadeModel{" +
                "id=" + id +
                ", nomeAtividade='" + nomeAtividade + '\'' +
                ", nivel='" + nivel +
                '}';
    }
}
