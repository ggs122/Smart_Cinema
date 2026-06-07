package br.com.smartcinema.interfaces;

@FunctionalInterface
public interface CreateDataGridSeats {

    void createDataGridSeats(int seatNumber, int aisleNumber, String fullName);
}
