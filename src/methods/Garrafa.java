package methods;

public class Garrafa {

    private String cor;
    private int capacidade;
    private String material;

    public Garrafa(String cor, int capacidade, String material) {
        this.cor = cor;
        this.capacidade = capacidade;
        this.material = material;
    }

    public String aguaDoce() {
        return "Esta garrafa de cor " + cor + ", com capacidade de " + capacidade + "ml, e feita de " + material + " contém água doce.";
    }
}
