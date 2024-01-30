// Estado "SemMoeda"
class SemMoeda implements Estado {
    @Override
    public void inserirMoeda() {
        System.out.println("Moeda inserida.");
        // Mudar para o estado "ComMoeda"
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Nenhuma moeda inserida.");
    }

    @Override
    public void selecionarBebida() {
        System.out.println("Por favor, insira uma moeda primeiro.");
    }

    @Override
    public void dispensarBebida() {
        System.out.println("Por favor, insira uma moeda primeiro.");
    }
}
