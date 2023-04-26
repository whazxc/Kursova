import java.time.LocalDate;

public class Room {
    private int roomNumber;
    private int beds;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String note;
    private int guests;
    private boolean available;

    public Room(int roomNumber, int beds){
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.note = note;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomNumber = roomnumber;
    }

    public int getRoom(){
        return roomNumber;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getBeds() {
        return beds;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public int getGuests() {
        return guests;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
}
