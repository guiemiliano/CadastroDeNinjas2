package dev.java10x.CadastroDeNinjas2.Missoes;
import dev.java10x.CadastroDeNinjas2.Ninja.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
