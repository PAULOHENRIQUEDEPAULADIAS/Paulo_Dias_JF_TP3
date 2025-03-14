package methods;

public class Cirgulo {
    private double raio;

    public Cirgulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double calcularArea(){
        double area = Math.PI * (Math.pow(this.raio, 2));

        return area;
    }
}
