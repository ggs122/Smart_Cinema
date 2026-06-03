package br.com.smartcinema.seats;

import java.util.ArrayList;
import java.util.List;

public class Seats {

    private int seatNumber;
    private int aisleNumber;
    private int movieTheaterNumber;
    private int amountSeat;

    private Seats(int seatNumber, int aisleNumber) {
        this.seatNumber = seatNumber;
        this.aisleNumber = aisleNumber;
        this.movieTheaterNumber = movieTheaterNumber;
        this.amountSeat = amountSeat;
    }

    public Seats() {}

    static List<List<Seats>> dataGridSeats = new ArrayList<>();

    public void createDataGridSeats(int seatNumber, int aisleNumber, int movieTheaterNumber) {
        for (int i = 0; i < aisleNumber; i++) {

            //TODO -> criar as linhas (Corredores).
            List<Seats>currentLine = new ArrayList<>();

            for (int j = 0; j < seatNumber; j++) {

                //TODO -> Criar as colunas (Assentos).
                Seats newSeat = new Seats(seatNumber, aisleNumber);

                //TODO -> adicionar os assentos as linhas(corredores)
                currentLine.add(newSeat);
            }

            //TODO -> Deposi de encher as linhas com as colunas adicionamos a linha inteira na grade principal.
            dataGridSeats.add(currentLine);
        }
    }
}
