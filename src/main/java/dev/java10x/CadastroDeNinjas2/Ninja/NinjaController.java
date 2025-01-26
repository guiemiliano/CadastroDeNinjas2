package dev.java10x.CadastroDeNinjas2.Ninja;

/*  NinjaController
    Controller é a parte mais próxima do usuário.
    Fica entre o banco de dados e o usuário sempre criar uma
    annotation @RestController e @RequestMapping no Spring quando
    for trabalhar com controladores, devo ter um mapa para essas
    rotas.

 */

import jakarta.persistence.PostUpdate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    //Injetando NinjaService que contém JPA extendido de NinjaRepository
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //Procurar ninja por id(Read)
    //Essa @PathVariable transforma meu id digitado em um caminho
    //na minha requisição, por exemplo:
    //Localhost:8080/ninjas/listar/1
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
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
