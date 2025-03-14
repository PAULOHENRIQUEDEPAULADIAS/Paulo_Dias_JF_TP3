package methods;

public class Product {
    private static int idCounter = 1;
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Product(String nome, double preco, int quantidadeEmEstoque) {
        this.id = idCounter++;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String exibirInformacoes() {
        return "ID: " + id + ", Nome: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidadeEmEstoque;
    }


}
