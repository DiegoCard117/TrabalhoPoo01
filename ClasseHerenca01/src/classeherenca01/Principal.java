package classeherenca01;

/**
 *
 * @author Maria Clara Duhau M. M. Gomes & Diego Cardoso Chagas
 */
public class Principal {

    public static void main(String[] args) {
        int cod = 1; //Valor para nao ter que setar codigo manualmente para cada setCodigo()
        
        //Instaciamento de Pessoa
        System.out.println("\n----------Classe Pessoa----------");
        Pessoa yasmin = new Pessoa();
        yasmin.setCodigo(cod++);
        yasmin.setNome("Yasmin");
        yasmin.setDataCadastro("25/03/2025");
        yasmin.apresentar();
        
        Pessoa ray = new Pessoa();
        ray.setCodigo(cod++);
        ray.setNome("Ray");
        ray.setDataCadastro("24/03/2025");
        ray.apresentar();
        
        //Instaciamento de Cliente
        System.out.println("\n----------Classe Cliente----------");
        Cliente diego = new Cliente();
        diego.setCodigo(cod++);
        diego.setNome("Diego");
        diego.setDataCadastro("23/03/2025");
        diego.setEmail("email1@email.com");
        diego.setEndereco("R Brasil 111");
        diego.setTelefone("34 99999-9999");
        diego.apresentar();
        
        Cliente marcio = new Cliente();
        marcio.setCodigo(cod++);
        marcio.setNome("Marcio");
        marcio.setDataCadastro("22/03/2025");
        marcio.setEmail("emai2@email.com");
        marcio.setEndereco("R Brasil 112");
        marcio.setTelefone("34 98888-9999");
        marcio.apresentar();
        
        //instanciamento de Usuario
        System.out.println("\n----------Classe Usuario----------");
        Usuario carlos = new Usuario();
        carlos.setCodigo(cod++);
        carlos.setNome("Carlos");
        carlos.setDataCadastro("21/03/2025");
        carlos.setLogin("Carlos123");
        carlos.setSenha("SenhaUltraForte");
        carlos.apresentar();
        
        Usuario miguel = new Usuario();
        miguel.setCodigo(cod++);
        miguel.setNome("Miguel");
        miguel.setDataCadastro("26/03/2025");
        miguel.setLogin("Miguel123");
        miguel.setSenha("SenhaUltraForte2");
        miguel.apresentar();
    }
}
