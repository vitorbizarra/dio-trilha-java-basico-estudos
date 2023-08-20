import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual:" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite o número do novo canal: ");
            int novoCanal = input.nextInt();

            smartTv.mudarCanal(novoCanal);
        }

        System.out.println("Novo status -> Canal atual: " + smartTv.canal);
    }
}
