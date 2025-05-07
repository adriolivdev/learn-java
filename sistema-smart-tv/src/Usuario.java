public class App {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada?" + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume Atual?" + smartTv.volume);

        // Corrigido: chamadas de métodos dentro do bloco main
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada?" + smartTv.ligada);
        smartTv.desligar();
    }
}
