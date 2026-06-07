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

    private SeatsImpl(int seatNumber, int aisleNumber, String fullName) {
        this.seatNumber = seatNumber;
        this.aisleNumber = aisleNumber;
        this.movieTheaterNumber = movieTheaterNumber;
        this.amountSeat = amountSeat;
        this.fullName = fullName;
    }

    public SeatsImpl() {}

   static List<List<SeatsImpl>> dataGridSeats = new ArrayList<>();

    @Override
    public void createDataGridSeats(int seatNumber, int aisleNumber, String fullName) {
        for (int i = 0; i < aisleNumber; i++) {

            //TODO -> criar as linhas (Corredores).
            List<SeatsImpl>currentLine = new ArrayList<>();

            for (int j = 0; j < seatNumber; j++) {

                //TODO -> Criar as colunas (Assentos).
                SeatsImpl newSeat = new SeatsImpl(j, aisleNumber, fullName);

                //TODO -> adicionar os assentos as linhas(corredores)
                currentLine.add(newSeat);
            }

            //TODO -> Deposi de encher as linhas com as colunas adicionamos a linha inteira na grade principal.
            dataGridSeats.add(currentLine);
        }
    }

    public static void printDataGridSeats() {
        for (List<SeatsImpl> aisleNumber : SeatsImpl.dataGridSeats) {
            for (SeatsImpl seats : aisleNumber) {
                System.out.print("[" + seats.seatNumber + " - " + seats.fullName + "]");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------");
    }
}
