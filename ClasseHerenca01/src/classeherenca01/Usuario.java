package classeherenca01;

/**
 *
 * @author Maria Clara Duhau M. M. Gomes & Diego Cardoso Chagas
 */
public class Usuario extends Pessoa {
    private String login;
    private String senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void apresentar(){
        System.out.println("\nNome: " + getNome());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Data do Cadastro: " + getDataCadastro());
        System.out.println("Login: " + getLogin());
        System.out.println("Senha: " + getSenha());
    }
    
}
