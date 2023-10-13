package jhenriquedsm.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeira-rota")
public class Controller { // recebe as requisições do usuário 
    
    /** METÓDOS HTTP
     * GET - Buscar uma informação
     * POST - Adicionar uma informação
     * PUT - Alterar uma informação
     * DELETE - Remover uma informação
     * PATCH - Alterar somente uma parte da informação
     */

    @GetMapping("/message")
    public String message() {
        return "Aopa";
    }
}
