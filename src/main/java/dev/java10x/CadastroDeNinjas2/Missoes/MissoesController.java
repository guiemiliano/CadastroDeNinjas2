package dev.java10x.CadastroDeNinjas2.Missoes;

/*
    Localhost:8080/rotascriadas
    Controller sempre criam rotas para o meu servidor, é a camada
    mais perto do usuário
 */

import org.springframework.web.bind.annotation.*;
/*
    Essa annotation tem muitas annotations dentro dela, cada uma delas faz algo
    RestController fala que isso é uma rota para nossas API e o RequestMapping vai mapear
    nossas API's
*/

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    //Recebe do usuário
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso";
    }

    @GetMapping("/listar")
    public String listarMissao(){
        return "Missões listadas com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada com sucesso";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missão deletada com sucesso";
    }

}
