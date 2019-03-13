package TheaterSeats;

/**
 * Created by Kuba on 13/03/2019.
 */
public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Teatr Juliusza Słowackiego", 8, 12);


        if (theatre.reserveSeat("H11")) {
            System.out.println("Pay for your Seat.");
        } else {
            System.out.println("Seat is reserved.");
        }


    }
}



