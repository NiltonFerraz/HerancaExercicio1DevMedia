public class ExemploInterfaceamento {

    public static void main(String[] args) {

        ModeloTV001 tv1 = new ModeloTV001(21);
        ModeloX tv2 = new ModeloX(42);
        tv1.ligar();
        tv2.ligar();
        System.out.println("TV1 - modelo " + tv1.MODELO + " está ");
        System.out.println(tv1.isLigada() ? "ligada" : "desligada");
        System.out.println("TV2 - modelo " + tv2.MODELO + " está ");
        System.out.println(tv1.isLigada() ? "status: ligada" : "status: desligada");
        //ambas as TVs estão ligadas e vamos desligá-las
        System.out.println("Desligando modelo " + tv1.MODELO);
        tv1.desligar();
        System.out.println(tv1.isLigada() ? "status: ligada" : "status: desligada");
        System.out.println("Desligando modelo " + tv2.MODELO);
        tv2.desligar();
        System.out.println(tv1.isLigada() ? "ligada" : "desligada");
    }

}
