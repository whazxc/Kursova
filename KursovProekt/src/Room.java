public class Room {
    private int room;
    private int beds;
    private boolean available = false;
    private Integer guests;
    public void setRoom(int room) {
        this.room = room;
    }

    public int getRoom() {
        return room;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getBeds() {
        return beds;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public Integer getGuests() {
        return guests;
    }
}
