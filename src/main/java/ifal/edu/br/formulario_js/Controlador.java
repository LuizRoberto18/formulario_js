package ifal.edu.br.formulario_js;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador{

    @RequestMapping("/")
    public String index() {
        return "ok";
    }
}