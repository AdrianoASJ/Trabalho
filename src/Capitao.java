
public class Capitao extends Usuario {

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome + "Capitão";
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public Cadastrar getUsuario() {
		return Usuario;
	}

	public void setUsuario(Cadastrar usuario) {
		Usuario = usuario;
	}
			
		}