import java.time.LocalDate;

public class Checkin{
    Room room;
    private LocalDate from;
    private LocalDate to;
    private String note;
    private Integer guests;

    public Checkin(Room room, LocalDate from, LocalDate to,String note){
        this.room = room;
        this.from = from;
        this.to = to;
        this.note = note;
        if(getGuests() == null){
            this.guests = room.getBeds();
        }
    }

    public int getRoom() {
        return room.getRoom();
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public String getNote() {
        return note;
    }

    public void setGuests(int guests) {
        this.guests = guests;
        if(getGuests() == 0){
            room.setAvailable(true);
        }
    }

    public Integer getGuests() {
        return guests;
    }

    public String checkin() {
        return "check-in " + getRoom() + " " + getFrom() + " " + getTo() + " " + getNote();
    }
}
