package dev.java10x.CadastroDeNinjas2.Ninjas;

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

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private int idade;

    //@ManyToOne um ninja tem uma única missão
    //Muitos ninjas para uma missão

    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key ou chave estrangeira
    private MissoesModel missoes;



    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public NinjaModel() {
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


}
