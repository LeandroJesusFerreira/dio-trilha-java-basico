public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("TV volume? " + smartTv.volume);
        System.out.println("TV canal? " + smartTv.canal);
    }
}
