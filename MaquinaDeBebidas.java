// Classe da Máquina de Bebidas
class MaquinaDeBebidas {
    private Estado estado;

    public MaquinaDeBebidas() {
        this.estado = new SemMoeda(); // Inicialmente, a máquina está no estado "SemMoeda"
    }

    public void inserirMoeda() {
        estado.inserirMoeda();
        if (estado instanceof SemMoeda) {
            estado = new ComMoeda();
        }
    }

    public void ejetarMoeda() {
        estado.ejetarMoeda();
        if (estado instanceof ComMoeda) {
            estado = new SemMoeda();
        }
    }

    public void selecionarBebida() {
        estado.selecionarBebida();
        if (estado instanceof ComMoeda) {
            // Dispensar a bebida
            // Mudar para o estado "SemMoeda"
            estado = new SemMoeda();
        }
    }

    public void dispensarBebida() {
        estado.dispensarBebida();
    }
}
