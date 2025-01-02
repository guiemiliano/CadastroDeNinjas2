package dev.java10x.CadastroDeNinjas2.Missoes;


import dev.java10x.CadastroDeNinjas2.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //@OneToMany Uma missão pode ter muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
