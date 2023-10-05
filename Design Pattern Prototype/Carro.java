// Classe Carro é o protótipo que vamos clonar
public class Carro implements Cloneable,Comparable<Carro> {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para clonar um carro
    @Override
    public Carro clone() {
        try {
            return (Carro) super.clone();
        } catch (CloneNotSupportedException e) {
            // Tratamento de exceção para CloneNotSupportedException
            return null;
        }
    }

    public void exibirDetalhes() {
        System.out.println("Carro: " + marca + " " + modelo);
    }

    public String toString(Carro c){
        return  "Marca: "+ c.marca +" MOdelo: " + c.modelo;
    }
    
    public int compareTo(Carro c1){
        return this.marca.compareTo(c1.marca);
    }
}
