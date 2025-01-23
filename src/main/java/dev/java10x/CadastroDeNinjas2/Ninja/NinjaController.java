package dev.java10x.CadastroDeNinjas2.Ninja;

/*  NinjaController
    Fica entre o banco de dados e o usuário sempre criar uma
    annotation @RestController e @RequestMapping no Spring quando
    for trabalhar com controladores, devo ter um mapa para essas
    rotas.

 */

import jakarta.persistence.PostUpdate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Mocks de endpoint
    //CRUD

    //Adicionar Ninjas(Create)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    //Mostrar todos os Ninjas(Read)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar todos os ninjas";
    }

    //Procurar ninja por id(Read)
    @GetMapping("/todosID")
    public String mostrarNinjasPorId(){
        return "Mostrar Ninja por Id";
    }

    //Alterar dados dos Ninjas(Update)
    @PutMapping("/alterar")
    public String alterarNinjasPorId(){
        return "Alterar Ninja por Id";
    }

    //Deletar Ninja(Delete)
    @DeleteMapping("/deletarId")
    public String deletarNinjasPorId(){
        return "Deletar Ninja por Id";
    }

}
