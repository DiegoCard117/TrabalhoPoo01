package classeheranca02;

/**
 *
 * @author Maria Clara Duhau M. M. Gomes & Diego Cardoso Chagas
 */
public class ContaCorrente extends ContaBancaria{
    private double limiteEspecial;

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        double confere = super.getRendaMensal() * 0.4;
        if(limiteEspecial > confere){
            this.limiteEspecial = super.getRendaMensal() * 0.2;
            System.out.println("Limite Especial maior que o esperado!");
            System.out.println("Limite Setado como: " + (super.getRendaMensal() * 0.2));
        }else{
            this.limiteEspecial = limiteEspecial;
        }
    }
    
    
}
