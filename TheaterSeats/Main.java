package TheaterSeats;

import java.util.List;
/**
 * Created by Kuba on 13/03/2019.
 */
public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Teatr Juliusza Słowackiego", 8, 12);



        if (theatre.reserveSeat("A02")) {
            System.out.println("pay");
        }
        else{
            System.out.println("tool8m8");
        }
        if (theatre.reserveSeat("A02")) {
            System.out.println("pay");
        }
        else{
            System.out.println("tool8m8");
        }
        if (theatre.reserveSeat("Z12")) {
            System.out.println("pay");
        }
        else{
            System.out.println("tool8m8");
        }
//comparable vs comparator

    }
    public static void printList(List<Theatre.Seat> list){
        for(Theatre.Seat seat : list){

            System.out.print (" "+ seat.getSeatNumber()+ " "+ seat.getPrice());
        }
        System.out.println();
        System.out.println("=============================");
    }
}



