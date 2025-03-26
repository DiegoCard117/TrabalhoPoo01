package classeheranca03;

/**
 *
 * @author Maria Clara Duhau M. M. Gomes & Diego Cardoso Chagas
 */

public class Principal {

    public static void main(String[] args) {
        Funcionario ana = new Funcionario();
        ana.setNome("Ana");
        ana.setSalario(1518.00);
        ana.calcularBonus("dezembro");
        //testando o acrescimo de bonus do mes de dezembro
    
        System.out.println("*******************************************************");
        Funcionario jorge = new Funcionario();
        jorge.setNome("Jorge");
        jorge.setSalario(1650.00);
        jorge.calcularBonus("janeiro");
        
        System.out.println("*******************************************************");
        Funcionario beatriz = new Funcionario();
        beatriz.setNome("Beatriz");
        beatriz.setSalario(1700.00);
        beatriz.calcularBonus("fevereiro");
        
        System.out.println("\n                        GERENTES                        \n");
        
        Gerente bruno = new Gerente();
        bruno.setNome("Bruno");
        bruno.setSalario(1720.00);
        bruno.setGratificacao(280.00);
        bruno.caluculaGratificacao();
        bruno.calcularBonus("março");
        
        System.out.println("*******************************************************");
        Gerente gisele = new Gerente();
        gisele.setNome("Gisele");
        gisele.setSalario(1800.00);
        gisele.setGratificacao(350.00);
        gisele.caluculaGratificacao();
        gisele.calcularBonus("dezembro");
        //testando salario com bonus + gratificação
        
        System.out.println("*******************************************************");
        Gerente antonio = new Gerente();
        antonio.setNome("Bruno");
        antonio.setSalario(1750.00);
        antonio.setGratificacao(150.00);
        antonio.caluculaGratificacao();
        antonio.calcularBonus("abril");
    
        System.out.println("\n                        PROGRAMADORES                        \n");
        
        Programador maiara = new Programador();
        maiara.setNome("Maiara");
        maiara.setSalario(2000.00);
        maiara.setValorPontoFuncao(2.50);
        maiara.calcularValorSoftware(500);
        maiara.calcularBonus("maio");
        
        System.out.println("*******************************************************");
        Programador jose = new Programador();
        jose.setNome("Jose");
        jose.setSalario(1900.00);
        jose.setValorPontoFuncao(1.50);
        jose.calcularValorSoftware(300);
        jose.calcularBonus("junho");
        
        System.out.println("*******************************************************");
        Programador talita = new Programador();
        talita.setNome("Talita");
        talita.setSalario(2500.00);
        talita.setValorPontoFuncao(2);
        talita.calcularValorSoftware(500);
        talita.calcularBonus("dezembro");
    }
    
}
