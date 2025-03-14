package methods;

public class Esfera {
    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double calcularVolume(){
        double volume = (4.0/3.0) * Math.PI * Math.pow(raio, 3);

        return volume;
    }
}
