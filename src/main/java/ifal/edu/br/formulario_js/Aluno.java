package ifal.edu.br.formulario_js;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    String nome;

    private String email;

    private String senha;

    private String confSenha;

    private String modulo;

    private String[] preferencias;

	public Long getId(){
		return getId();
	}
    
	public String getNome() {
		return getNome();
	}

    public void setNome(String nome){
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

	public void setId(Long id) {
		this.id = id;
	}

}