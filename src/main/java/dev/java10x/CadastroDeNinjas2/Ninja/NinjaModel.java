package dev.java10x.CadastroDeNinjas2.Ninja;

/*
    Para uma tabela no banco de dados preciso sempre de um ID,
    pois um ID é único e faz com que seja mais fácil de procurar.
    a ID a gente só declara e deixa o java trabalhar pra gente,
    não precisa colocar no construtor

    Entity
    utilizando a JPA
    tenho acesso a @Entity e transformo a classe
    numa entidade no banco de dados

    Table()
    coloca nome na tabela

 */

import dev.java10x.CadastroDeNinjas2.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    //@ManyToOne um ninja tem uma única missão
    //Muitos ninjas para uma missão

    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key ou chave estrangeira
    private MissoesModel missoes;




}


