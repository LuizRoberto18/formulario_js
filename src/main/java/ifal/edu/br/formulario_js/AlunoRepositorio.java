package ifal.edu.br.formulario_js;

public interface AlunoRepositorio extends CrudRepository<Aluno, Long>{
    List<Aluno> findByNomeContaining(String nome);
}