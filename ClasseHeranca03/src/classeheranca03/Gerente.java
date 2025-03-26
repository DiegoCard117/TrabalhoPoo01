package classeheranca03;

/**
 *
 * @author Maria Clara Duhau M. M. Gomes & Diego Cardoso Chagas
 */
public class Gerente extends Funcionario{
    private double gratificacao;

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    public void caluculaGratificacao(){
        super.setSalario(super.getSalario() + this.getGratificacao());
    }
}
