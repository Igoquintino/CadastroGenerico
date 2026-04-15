package Igoquintino.github.CadastroDeGenericos.Genericos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class GenericoController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Minha primeira mensagem nessa rota";
    }
}

