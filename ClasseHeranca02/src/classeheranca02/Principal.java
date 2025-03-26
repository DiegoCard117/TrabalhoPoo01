package classeheranca02;

/**
 *
 * @author Maria Clara Duhau M. M. Gomes & Diego Cardoso Chagas
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("          CONTA BANCARIA:          ");
        
        ContaBancaria ContaB1 = new ContaBancaria();
        ContaB1.setTitular("");
        //nome seta como :Não identificado
        ContaB1.setSaldo(750.00);
        ContaB1.setRendaMensal(1000.00);
        System.out.println("A renda Mensal de " + ContaB1.getTitular() + " é de: R$" + ContaB1.getRendaMensal());
        ContaB1.sacar(1000.00);
        ContaB1.verificarSaldo();
        ContaB1.depositar(250.00);
        ContaB1.verificarSaldo();
        //Esse primeiro objeto criei para o teste das verificaçoões dos setters Titular e RendaMensal, e o método Sacar
        
        System.out.println("*******************************************************");
        ContaBancaria ContaB2 = new ContaBancaria();
        ContaB2.setTitular("Fatima");
        ContaB2.setSaldo(1500.00);
        ContaB2.setRendaMensal(3500.00);
        System.out.println("A renda Mensal de " + ContaB2.getTitular() + " é de: R$" + ContaB2.getRendaMensal());
        ContaB2.sacar(500.00);
        ContaB2.verificarSaldo();
        ContaB2.depositar(250.00);
        ContaB2.verificarSaldo();
        
        System.out.println("*******************************************************");
        ContaBancaria ContaB3 = new ContaBancaria();
        ContaB3.setTitular("Luis Carlos");
        ContaB3.setSaldo(4000.00);
        ContaB3.setRendaMensal(5000.00);
        System.out.println("A renda Mensal de " + ContaB3.getTitular() + " é de: R$" + ContaB3.getRendaMensal());
        ContaB3.sacar(2500.50);
        ContaB3.verificarSaldo();
        ContaB3.depositar(400.00);
        ContaB3.verificarSaldo();
        
        
        System.out.println("\n*******************************************************\n");
        System.out.println("          CONTA POUPANCA:          ");
        
        ContaPouPanca ContaP1 = new ContaPouPanca();
        ContaP1.setTitular("Maria");
        ContaP1.setSaldo(1500.00);
        ContaP1.setRendaMensal(3700.00);
        System.out.println("A renda Mensal de " + ContaP1.getTitular() + " é de: R$" + ContaP1.getRendaMensal());
        ContaP1.sacar(350.00);
        ContaP1.verificarSaldo();
        ContaP1.depositar(150.00);
        ContaP1.verificarSaldo();
        ContaP1.setTaxaJuros(0.5);
        ContaP1.aplicarJuros();
        ContaP1.verificarSaldo();
        //No Objeto ContaP3 testamos O SetJuros indicando uma taxa abaixo do valor minimo
        
        System.out.println("*******************************************************");
        ContaPouPanca ContaP2 = new ContaPouPanca();
        ContaP2.setTitular("Joao");
        ContaP2.setSaldo(2700.00);
        ContaP2.setRendaMensal(4200.00);
        System.out.println("A renda Mensal de " + ContaP2.getTitular() + " é de: R$" + ContaP2.getRendaMensal());
        ContaP2.sacar(2700.00);
        ContaP2.verificarSaldo();
        ContaP2.setTaxaJuros(0.9);
        ContaP2.aplicarJuros();
        ContaP2.verificarSaldo();
        //No Objeto ContaP2 testamos o metodo aplicarJuros em uma conta com saldo=0
        
        System.out.println("*******************************************************");
        ContaPouPanca ContaP3 = new ContaPouPanca();
        ContaP3.setTitular("Carlos");
        ContaP3.setSaldo(3000.00);
        ContaP3.setRendaMensal(3000.00);
        System.out.println("A renda Mensal de " + ContaP3.getTitular() + " é de: R$" + ContaP3.getRendaMensal());
        ContaP3.sacar(2000.00);
        ContaP3.verificarSaldo();
        ContaP3.depositar(100.00);
        ContaP3.verificarSaldo();
        ContaP3.setTaxaJuros(1.5);
        ContaP3.aplicarJuros();
        ContaP3.verificarSaldo();
        
        System.out.println("\n*******************************************************\n");
        
        System.out.println("          CONTA CORRENTE:          ");
        ContaCorrente ContaC1 = new ContaCorrente();
        ContaC1.setTitular("Diego");
        ContaC1.setSaldo(1250.00);
        ContaC1.setRendaMensal(4000.00);
        System.out.println("A renda Mensal de " + ContaC1.getTitular() + " é de: R$" + ContaC1.getRendaMensal());
        ContaC1.sacar(200.00);
        ContaC1.verificarSaldo();
        ContaC1.depositar(500.00);
        ContaC1.verificarSaldo();
        ContaC1.setLimiteEspecial(3500.00);
        System.out.println("O Limite especial de " + ContaC1.getTitular() + " é de: R$" + ContaC1.getLimiteEspecial());
        //No objeto ContaC3 testamos se a validação do setLimiteEspecial está funcionando conforme o esperado
        
        System.out.println("*******************************************************");
        ContaCorrente ContaC2 = new ContaCorrente();
        ContaC2.setTitular("Luisa");
        ContaC2.setSaldo(5000.00);
        ContaC2.setRendaMensal(7000.00);
        System.out.println("A renda Mensal de " + ContaC2.getTitular() + " é de: R$" + ContaC2.getRendaMensal());
        ContaC2.sacar(2500.00);
        ContaC2.verificarSaldo();
        ContaC2.depositar(1000.00);
        ContaC2.verificarSaldo();
        ContaC2.setLimiteEspecial(2800.00);
        System.out.println("O Limite especial de " + ContaC2.getTitular() + " é de: R$" + ContaC2.getLimiteEspecial());
        
        System.out.println("*******************************************************");
        ContaCorrente ContaC3 = new ContaCorrente();
        ContaC3.setTitular("Gabriel");
        ContaC3.setSaldo(450.00);
        ContaC3.setRendaMensal(1000.00);
        System.out.println("A renda Mensal de " + ContaC3.getTitular() + " é de: R$" + ContaC3.getRendaMensal());
        ContaC3.sacar(250.00);
        ContaC3.verificarSaldo();
        ContaC3.depositar(32.95);
        ContaC3.verificarSaldo();
        ContaC3.setLimiteEspecial(400.00);
        System.out.println("O Limite especial de " + ContaC3.getTitular() + " é de: R$" + ContaC3.getLimiteEspecial());
        
    }
    
}
