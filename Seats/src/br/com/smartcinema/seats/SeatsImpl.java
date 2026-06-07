package br.com.smartcinema.seats;

import br.com.smartcinema.interfaces.CreateDataGridSeats;

import java.util.ArrayList;
import java.util.List;

public class SeatsImpl implements CreateDataGridSeats {

    private int seatNumber;
    private int aisleNumber;
    private int movieTheaterNumber;
    private int amountSeat;
    private String fullName;

    private int rowIdentifier;
    private int seatIdentifier;
    SeatsImpl [][] dataGridSeats;

//    private SeatsImpl(int seatNumber, int aisleNumber) {
//        this.seatNumber = seatNumber;
//        this.aisleNumber = aisleNumber;
//    }

    private SeatsImpl(String fullName) {
        this.fullName = fullName;
    }

    public SeatsImpl() {}


    private SeatsImpl(int rowIdentifier, int seatIdentifier) {
        this.rowIdentifier = rowIdentifier;
        this.seatIdentifier = seatIdentifier;
        this.fullName = "Disponível";
    }

    private SeatsImpl(String fullName, int rowIdentifier, int seatIdentifier) {
        this.fullName = fullName;
        this.rowIdentifier = rowIdentifier;
        this.seatIdentifier = seatIdentifier;
    }



    @Override
    public void createGridSeats(int seatNumber, int aisleNumber) {
        this.seatNumber = seatNumber;
        this.aisleNumber = aisleNumber;
        this.dataGridSeats = new SeatsImpl[this.seatNumber][this.aisleNumber];

        for (int i = 0; i < this.seatNumber; i++) {
            for (int j = 0; j < this.aisleNumber; j++) {
                dataGridSeats[i][j] = new SeatsImpl(i + 1, j +1);
            }
        }
    }

    @Override
    public void addClient(String fullName, int line, int row) {
        SeatsImpl seats = new SeatsImpl(fullName, line + 1, row + 1);
        dataGridSeats[line][row] = seats;
    }

    @Override
    public void printDataGridSeats() {

        if (dataGridSeats == null) {
            System.out.println("A sala de cinema ainda não foi criada.");
            return;
        }

        for (int i = 0; i < dataGridSeats.length; i++) {
            for (int j = 0; j < dataGridSeats[i].length; j++) {
               SeatsImpl seat = dataGridSeats[i][j];
                System.out.print("[L" + seat.rowIdentifier + "-C" + seat.seatIdentifier + ": " + seat.fullName + "] ");
            }
            System.out.println();
        }

//        for (int i = 0; i < seatNumber; i++) {
//            for (int j = 0; j < aisleNumber; j++) {
//                if (dataGridSeats[i][j] == null) {
//                    System.out.print("[Disponível]");
//                } else {
//                    System.out.print("[" + dataGridSeats[i][j].fullName + "]" + " ");
//                }
//            }
//            System.out.println();
//        }
    }

}
