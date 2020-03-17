public interface ControleRemoto {

    void mudarCanal(int canal);
    void aumentarVolume(int taxa);
    void diminuirVolume(int taxa);
    boolean ligar();
    boolean desligar();
}
