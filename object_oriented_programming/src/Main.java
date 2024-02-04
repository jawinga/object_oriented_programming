import coche.Coche;

public class Main {

    public static void main(String[] args) {

        Coche coche1 = new Coche("Opel", "Corsa", "345634HMK", 10, 0, 95, 12, 30);
        coche1.Acelerar(coche1.getCv(), coche1.getKmH(), coche1.getAcelerar());

        Coche coche2 = new Coche("Audi", "A3", "23423HMK", 10, 0, 150, 56, 30);
        coche1.Acelerar(coche2.getCv(), coche2.getKmH(), coche2.getAcelerar());

        coche1.mostrarDatos(coche1.getMarca(), coche1.getModelo(), coche1.getCv(), coche1.getCc());


    }


    }

