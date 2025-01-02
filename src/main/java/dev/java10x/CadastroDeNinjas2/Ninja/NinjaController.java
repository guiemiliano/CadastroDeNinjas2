package dev.java10x.CadastroDeNinjas2.Ninja;

/*  NinjaController
    Fica entre o banco de dados e o usuário sempre criar uma
    annotation @RestController e @RequestMapping no Spring quando
    for trabalhar com controladores, devo ter um mapa para essas
    rotas.

 */

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

}
