package classeherenca01;

/**
 *
 * @author Maria Clara Duhau M. M. Gomes & Diego Cardoso Chagas
 *
 */
public class Cliente extends Pessoa {
    private String email;
    private String endereco;
    private String telefone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void apresentar(){
        System.out.println("\nNome: " + getNome());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Data do Cadastro: " + getDataCadastro());
        System.out.println("Email: " + getEmail());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
   }
    
}
