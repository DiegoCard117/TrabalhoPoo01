package classeheranca02;

/**
 *
 * @author Maria Clara Duhau M. M. Gomes & Diego Cardoso Chagas
 */
public class ContaBancaria {
    private String titular;
    private double saldo;
    private double rendaMensal;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
        if(titular.equals("")){
            this.titular = "Não Identificado";
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        if(rendaMensal >= 3036.00){
            this.rendaMensal = rendaMensal;
        }else{
            this.rendaMensal = 3036.00;
            System.out.println("Renda Mensal setada como R$3036,00");
        }
    }
    
    public void depositar(double montante){
        this.setSaldo(saldo += montante);
    }
    
    public void sacar(double montante){
        if(this.getSaldo() >= montante){
            this.setSaldo(saldo -= montante);
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void verificarSaldo(){
        System.out.println("O saldo na conta de " + this.getTitular() + " é: R$" + this.getSaldo());
    }
    
    
}
