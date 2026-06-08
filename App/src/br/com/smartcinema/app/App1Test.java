package br.com.smartcinema.app;

import br.com.smartcinema.interfaces.CreateDataGridSeats;
import br.com.smartcinema.seats.SeatsImpl;

public class App1Test {

    static void main(String[] args) {


        CreateDataGridSeats s1 = new SeatsImpl();
        s1.createGridSeats(10, 3);
        s1.addClient("Patricia Moreira", 0, 0);
        s1.addClient("Graciano Gomes", 0, 1);
        s1.addClient("Silenia Moraes", 0, 2);
        s1.addClient("Beatriz Rangel", 1, 0);
        s1.addClient("Vitor Rangel", 1, 1);
        s1.addClient("Silvia Braga", 1, 2);
        s1.addClient("Jorge Braga", 5, 0);
        s1.printDataGridSeats();

    }

}
