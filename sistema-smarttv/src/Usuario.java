public class Usuario {
    
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Estado Inicial da SmartTv");

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        //Ligar TV
        smartTv.ligar();
        System.out.println("TV ligada ? " + smartTv.ligada);

        //Diminuir volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " + smartTv.volume);

        //Mudar de canal
        smartTv.mudarCanal(10);
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual : " + smartTv.canal);
    }
}
