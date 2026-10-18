package itm.oss.booking;

import java.util.ArrayList;
import java.util.List;

public class BookingBook {
    private final ArrayList<Booking> bookings;

    public BookingBook(List<Booking> initialBookings) {
        this.bookings = new ArrayList<>(
                initialBookings == null ? List.of() : initialBookings);
    }

    public List<Booking> all() {
        return new ArrayList<>(bookings);
    }

    /**
     * Issue 4.
     */
    public Booking update(int id, Booking replacement) {
        throw new UnsupportedOperationException(
                "Issue 4: BookingBook.update() is not implemented yet");
    }

    /**
     * Issue 4.
     * Marks the booking with the given id as CANCELLED. Cancelling an already cancelled booking is allowed and leaves it cancelled.
     *
     * @throws IllegalArgumentException if no booking with the given id exists
     */
    public Booking cancel(int id) {
        int index = indexOfId(id);
        Booking cancelled = bookings.get(index).withStatus(BookingStatus.CANCELLED);
        bookings.set(index, cancelled);
        return cancelled;
    }
}
