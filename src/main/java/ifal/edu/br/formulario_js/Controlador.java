package ifal.edu.br.formulario_js;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador{

    @Autowired
    AlunoRepositorio AlunoRepo;
    Aluno aluno = new Aluno();

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index.html");
    }

    @RequestMapping("/formulario")
    public ModelAndView formulario(Aluno aluno) {
        ModelAndView retorna = new ModelAndView("formulario.html");
        retorna.addObject("aluno", aluno);
        return retorna;
    }

    @RequestMapping("/cadastro")
    public ModelAndView cadastro(Aluno aluno, RedirectAtributes redirect) {
        AlunoRepo.save(aluno);
        ModelAndView retorna = new ModelAndView("redirect:/tabela.html");
        redirect.addFlashAttribute("mensagem", aluno.getNome() + "Cadastrado com sucesso");
    }
}