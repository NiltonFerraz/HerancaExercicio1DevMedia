public class ModeloX extends TV implements ControleRemoto {

    public final String MODELO = "TV-X";

    public ModeloX(int tamanho){
        super(tamanho);
    }
    public boolean desligar(){
        System.out.println("Obrigado por utilizar a TV!");
        super.setLigada(false);
        return false;
    }
    public boolean ligar(){
        return true;
    }
    public void aumentarVolume(int taxa){ }
    public void diminuirVolume(int taxa){ }
    public void mudarCanal(int canal){ }
}
