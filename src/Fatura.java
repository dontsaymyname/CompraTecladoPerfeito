import java.util.ArrayList;
import java.util.List;

public class Fatura {

    List<Item> listaDeItens = new ArrayList<>();



    public void adicionarItem(Item item){
        listaDeItens.add(item);
        System.out.println("Nome: " + item.getDescricao() + "    " + "R$" + item.getPreco() + "    " + "Qtd: " + item.getQuantidadeComprada());
    }

    public float getTotalFatura(){
        float totalDaFatura = 0;
        for (Item item: listaDeItens){
            float totalPorItem = item.getPreco() * item.getQuantidadeComprada();
            totalDaFatura = totalDaFatura + totalPorItem;

        }
        return totalDaFatura;
    }
}
