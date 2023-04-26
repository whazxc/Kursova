import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Hotel h = new Hotel();
        Room room1 = new Room(1, 1);
        Room room2 = new Room(2, 1);
        Room room3 = new Room(3, 1);
        h.addRoom(room1);
        h.addRoom(room2);
        h.addRoom(room3);

        h.checkIn(1, LocalDate.of(2033,1,1), LocalDate.of(2034,2,2), "gg");
        h.checkIn(2, LocalDate.of(2013,3,1), LocalDate.of(2014,2,6), "gg");
        h.checkIn(3, LocalDate.of(2005,1,1), LocalDate.of(2005,1,3), "gg");

        h.find(2,LocalDate.of(2005,1,1), LocalDate.of(2013,2,1));

    }
}