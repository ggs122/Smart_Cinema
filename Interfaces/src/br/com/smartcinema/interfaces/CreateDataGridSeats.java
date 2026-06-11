package br.com.smartcinema.interfaces;


public interface CreateDataGridSeats {

    void addClient(String fullName, String ticketNumber, int line, int row);

//    void createGridSeats(int seatNumber, int aisleNumber);

    void createGridSeats(int seatNumber, int aisleNumber);

    void printDataGridSeats();
}
