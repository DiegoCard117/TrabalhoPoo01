package classeheranca03;

/**
 *
 * @author Maria Clara Duhau M. M. Gomes & Diego Cardoso Chagas
 */
public class Programador extends Funcionario{
    private double valorPontoFuncao;

    public double getValorPontoFuncao() {
        return valorPontoFuncao;
    }

    public void setValorPontoFuncao(double valorPontoFuncao) {
        this.valorPontoFuncao = valorPontoFuncao;
    }
    
    public void calcularValorSoftware(int linhasCodigo){
        double orcamento;
        orcamento = linhasCodigo * this.getValorPontoFuncao();
        System.out.println("O valor do software será de R$" + orcamento);
        super.setSalario(super.getSalario() + orcamento);
    }
}
