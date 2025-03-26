package classeheranca03;

/**
 *
 * @author Maria Clara Duhau M. M. Gomes & Diego Cardoso Chagas
 */
public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcularBonus(String mesPagamento){
        double bonus = this.getSalario();
        if(mesPagamento.equals("dezembro") || mesPagamento.equals("12")){
            bonus = this.getSalario() * 0.10;
            bonus += this.getSalario();
        }
        System.out.println("Funcionário " + this.getNome() + ". Salário para o mês " + mesPagamento + ": R$" + bonus );
    }
}
