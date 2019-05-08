import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Fatura fatura = new Fatura();
        Item teclado = new Item(181828291, "Teclado Razer", 0, 400F);
        Item monitor = new Item(191828191, "Monitor Benq", 0, 1000F);
        Item gpu = new Item(182172182, "Placa de Vídeo Nvidia GTX 1080Ti", 0, 3000F);

        Scanner scanner = new Scanner(System.in);

        Integer produtoDigitado = 0;
        while (produtoDigitado != 4) {


            System.out.println("Digite o número do produto que deseja comprar");
            System.out.println("1 - " + teclado.getDescricao());
            System.out.println("2 - " + monitor.getDescricao());
            System.out.println("3 - " + gpu.getDescricao());
            System.out.println("4 - Voltar");
            produtoDigitado = scanner.nextInt();

            if (produtoDigitado == 1) {
                System.out.println("Você escolheu " + teclado.getDescricao());
                System.out.println("Digite a quantidade");
                Integer quantidadeDigitada = scanner.nextInt();
                teclado.setQuantidadeComprada(quantidadeDigitada);
                fatura.adicionarItem(teclado);

            }
            if (produtoDigitado == 2) {
                System.out.println("Você escolheu " + monitor.getDescricao());
                System.out.println("Digite a quantidade");
                Integer quantidadeDigitada = scanner.nextInt();
                monitor.setQuantidadeComprada(quantidadeDigitada);
                fatura.adicionarItem(monitor);

            }
            if (produtoDigitado == 3) {
                System.out.println("Você escolheu " + gpu.getDescricao());
                System.out.println("Digite a quantidade");
                Integer quantidadeDigitada = scanner.nextInt();
                gpu.setQuantidadeComprada(quantidadeDigitada);
                fatura.adicionarItem(gpu);

            }
            if (produtoDigitado == 4) {

                System.out.println("Finalizando compra");

            }
        }

        fatura.getTotalFatura();
        System.out.println("Valor total R$:" + fatura.getTotalFatura());
    }
}
