public class ModeloTV001 extends TV implements ControleRemoto {

    public final String MODELO = "TV001";

    public ModeloTV001(int tamanho){
        super(tamanho);
    }
    public void mudarCanal(int canal){ }

    @Override
    public void aumentarVolume(int taxa) {  }

    @Override
    public void diminuirVolume(int taxa) {  }

    @Override
    public boolean ligar() {
        super.setLigada(true);
        return true;
    }

    @Override
    public boolean desligar() {
        super.setLigada(false);
        return false;
    }

}
