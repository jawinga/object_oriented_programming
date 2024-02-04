package coche;

public class Coche {

    private String marca, modelo, matricula;
    private int kmH, kmRecorridos, cv, cc, acelerar;

    public Coche (){}

    public Coche(String marca, String modelo, String matricula, int kmH, int kmRecorridos, int cv, int cc, int acelerar) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.kmRecorridos = kmRecorridos;
        this.cv = cv;
        this.cc = cc;
        this.kmH = kmH;
        this.acelerar = acelerar;

    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public int getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(int kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }


    public int getAcelerar() {
        return acelerar;
    }

    public int getKmH() {
        return kmH;
    }

    public void setKmH(int kmH) {
        this.kmH = kmH;
    }

    public void setAcelerar(int acelerar) {
        this.acelerar = acelerar;
    }

    public int Acelerar(int cv, int kmH, int acelerar){

        int velocidad_actual = kmH;

        if (cv<100 & kmH == 10){

            velocidad_actual += (int) ((double)(Math.random()*acelerar));

        }

        if (cv>100 & kmH == 10){
            int valorMinimo = 10;
            velocidad_actual += (int) ((double) ((Math.random() * (acelerar - valorMinimo +1)) + kmH));

        }
        System.out.println(velocidad_actual + "km/h");

        return velocidad_actual;
    }

    public void mostrarDatos (String marca, String modelo, int cc, int cv){

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matricula: " + matricula);
        System.out.println("CC: " + cc);
        System.out.println("CV: " + cv);
        System.out.println("Velocidad del coche: " + kmH);


    }

}
