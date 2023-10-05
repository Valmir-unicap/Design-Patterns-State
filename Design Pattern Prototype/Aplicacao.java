public class Aplicacao {
    public static void main(String[] args) {
        // Criando um protótipo de carro
        Carro prototipoCarro = new Carro("Toyota", "Corolla");

        // Clonando o protótipo para criar novos carros
        Carro carro1 = prototipoCarro.clone();
        Carro carro2 = prototipoCarro.clone();

        // Modificando os carros clonados
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        //verifica se o atributo e igual
        if(carro1.compareTo(carro2) == 0){ 
            System.out.println("sim!");
        }else{
            System.out.println("nao");
        }

        // Verificando se os objetos são diferentes
        System.out.println("carro1 é igual a prototipoCarro? " + (carro1 == prototipoCarro));
        System.out.println("carro2 é igual a prototipoCarro? " + (carro2 == prototipoCarro));
    }
}
