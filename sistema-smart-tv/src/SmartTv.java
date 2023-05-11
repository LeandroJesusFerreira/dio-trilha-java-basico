/**
 * Classe para manipulação da SmartTV
 * @author Leandro Jesus Ferreira da Rosa
 * @since 11/05/2023
 * @version 1.0.0
 */
public class SmartTv{
    boolean ligada= false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        volume--;
    }

    public void subirCanal(){
        canal++;
    }

    /**
     * Metodo serve para descer para um canal abaixo do atual
     */
    public void descerCanal(){
        canal--;
    }

    /**
     * Metodo serve para mudar o canal da SmartTV
     * @param novoCanal informe o novo canal
     */
    public void mudarCanal(int novoCanal){
        this.canal = novoCanal;
    }
}