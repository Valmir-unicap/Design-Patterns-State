
// Estado "ComMoeda"
class ComMoeda implements Estado {
    @Override
    public void inserirMoeda() {
        System.out.println("Moeda já inserida.");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Moeda ejetada.");
        // Mudar para o estado "SemMoeda"
    }

    @Override
    public void selecionarBebida() {
        System.out.println("Bebida selecionada.");
        // Dispensar a bebida
        // Mudar para o estado "SemMoeda"
    }

    @Override
    public void dispensarBebida() {
        System.out.println("Por favor, selecione uma bebida primeiro.");
    }
}
