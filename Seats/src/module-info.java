import br.com.smartcinema.interfaces.CreateDataGridSeats;
import br.com.smartcinema.seats.SeatsImpl;

module Seats {
    exports br.com.smartcinema.seats;

    requires Interfaces;

    provides CreateDataGridSeats with SeatsImpl;

}