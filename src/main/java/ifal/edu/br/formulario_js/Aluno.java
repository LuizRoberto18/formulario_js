package ifal.edu.br.formulario_js;;

@Entity
public class Aluno{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id; 

    private String nome;

    private String email;

    private String senha;

    private String confSenha;

    private String modulo;

    private String[] preferencias;

	public Long getId(){
		return super.getId();
	}
    
	public String getNome() {
		return super.getNome();
	}

    public String setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

    public String[] getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(String[] preferencias) {
		this.preferencias = preferencias;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfSenha() {
		return confSenha;
	}

	public void setConfSenha(String confSenha) {
		this.confSenha = confSenha;
	}

}