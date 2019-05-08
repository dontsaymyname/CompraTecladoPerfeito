public class Item {

    private int numero;
    private String descricao;
    private int quantidadeComprada;
    private float precoPorItem;


    public Item (int numero, String descricao, int quantidadeComprada, float precoPorItem){

        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        this.precoPorItem = precoPorItem;

        if (quantidadeComprada <= 0){
            quantidadeComprada = 0;
        }

        if (precoPorItem <= 0){
            precoPorItem = 0.0F;
        }

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public float getPreco() {
        return precoPorItem;
    }

    public void setPreco(float preco) {
        this.precoPorItem = preco;
    }
}
