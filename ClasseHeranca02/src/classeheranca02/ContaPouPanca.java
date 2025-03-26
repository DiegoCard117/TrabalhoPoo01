package classeheranca02;

/**
 *
 * @author Maria Clara Duhau M. M. Gomes & Diego Cardoso Chagas
 */
public class ContaPouPanca extends ContaBancaria{
    private double taxaJuros;

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        if(taxaJuros >= 0.6 && taxaJuros <= 2.8){
            this.taxaJuros = taxaJuros;
        }
        else{
            System.out.println("Taxa de Juros inválida, juros setado como 1.0");
            this.taxaJuros = 1.0;
        }
    }
    
    public void aplicarJuros(){
        double juros = this.getTaxaJuros()/100;
        juros *= super.getSaldo();
        juros += super.getSaldo();
        super.setSaldo(juros);
    }
    
    
}
