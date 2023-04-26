import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    ArrayList<Room> rooms = new ArrayList<Room>();

    public void addRoom(Room room){
        rooms.add(room);
    }

    public void checkIn(int roomNumber, LocalDate from, LocalDate to, String note){
        for(int a = 0; a < rooms.size(); a++){
            if(rooms.get(a).getRoom() == roomNumber){
                rooms.get(a).setFromDate(from);
                rooms.get(a).setToDate(to);
                rooms.get(a).setNote(note);
                rooms.get(a).setAvailable(false);
            }
        }
    }
    public void checkIn(int roomNumber, LocalDate from, LocalDate to, String note, int guests){
        for(int a = 0; a < rooms.size(); a++){
            if(rooms.get(a).getRoom() == roomNumber){
                rooms.get(a).setFromDate(from);
                rooms.get(a).setToDate(to);
                rooms.get(a).setNote(note);
                rooms.get(a).setGuests(guests);
                rooms.get(a).setAvailable(false);
            }
        }
    }

    public void availability(LocalDate date){
        for(int a = 0; a < rooms.size(); a++){
            try{
                if(date.isAfter(rooms.get(a).getToDate()) || date.isBefore(rooms.get(a).getFromDate())) {
                    System.out.println("Room number: " + rooms.get(a).getRoom() + " is available on " + date);
                }
            }
            catch(NullPointerException e){
                System.out.println("Room number: " + rooms.get(a).getRoom() + " is available on " + date);
            }
        }
    }
}
