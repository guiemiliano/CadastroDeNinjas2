package dev.java10x.CadastroDeNinjas2.Ninja;

/*
    É no Service que fazemos a lógica do programa
    1 - Ela deve se comunicar com a camada de repositório,
    dar permissão ao service a ter acesso ao repositório
*/

import org.springframework.stereotype.Service;

import java.util.List;

/*
        É basicamente inicializar um atributo
        Criamos um construtor para inicializar ou fazemos
        uma anottation para criar esse construtor como @Autowired
        É UMA CONVENÇÃO CRIARMOS O CONSTRUTOR NESSE CASO
    */
@Service
public class NinjaService {

    //Injetando NinjaRepository que contém JPA
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os meus ninjas

    //Pego tudo que se parece com ninja model e vou colocar em uma lista
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

}
