package classeherenca01;

/**
 *
* @author Maria Clara Duhau M. M. Gomes & Diego Cardoso Chagas
 */
public class Pessoa {
    private int codigo;
    private String nome;
    private String dataCadastro;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    public void apresentar(){
        System.out.println("\nNome: " + getNome());
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Data do Cadastro: " + getDataCadastro());
    }
}
