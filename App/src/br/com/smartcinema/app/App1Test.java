package br.com.smartcinema.app;

import br.com.smartcinema.interfaces.CreateDataGridSeats;
import br.com.smartcinema.seats.SeatsImpl;

public class App1Test {

    static void main(String[] args) {


        CreateDataGridSeats s1 = new SeatsImpl();
        s1.createDataGridSeats(10, 3, "Marcos Souza da Silva");

        SeatsImpl.printDataGridSeats();

    }

}
