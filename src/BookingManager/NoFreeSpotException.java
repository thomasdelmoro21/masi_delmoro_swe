package BookingManager;

public class NoFreeSpotException extends Exception {

    NoFreeSpotException(){
        super("Nessun posto disponibile");
    }
}
