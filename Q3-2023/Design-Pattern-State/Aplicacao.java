public class Aplicacao {
    public static void main(String[] args) {
        MaquinaDeBebidas maquina = new MaquinaDeBebidas();

        maquina.inserirMoeda();
        maquina.selecionarBebida();
        maquina.ejetarMoeda();

        maquina.inserirMoeda();
        maquina.selecionarBebida();
    }
}
