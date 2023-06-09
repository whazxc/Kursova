import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

    public void checkOut(int roomNumber){
        for(int a = 0; a < rooms.size(); a++){
            if(rooms.get(a).getRoom() == roomNumber){
                rooms.get(a).setGuests(0);
                rooms.get(a).setFromDate(null);
                rooms.get(a).setToDate(null);
                rooms.get(a).setNote("");
                rooms.get(a).setAvailable(true);
            }
        }
    }

    public void report(LocalDate from, LocalDate to){

        for(int a = 0; a < rooms.size(); a++){
            if(!rooms.get(a).getFromDate().isAfter(to) && !rooms.get(a).getToDate().isBefore(from)){
                System.out.println("Room number: " + rooms.get(a).getRoom() + " is used during the period - " + rooms.get(a).getFromDate() + " - " + rooms.get(a).getToDate());
                System.out.println("The room has been used for " + ChronoUnit.DAYS.between(rooms.get(a).getFromDate(), rooms.get(a).getToDate()) + " days");
            }
        }
    }

    public void find(int beds, LocalDate from, LocalDate to){
        boolean roomsAvailable = false;
        for(int a = 0; a < rooms.size(); a++){
            if(rooms.get(a).getBeds() == beds && (rooms.get(a).getFromDate().isAfter(to) || rooms.get(a).getToDate().isBefore(from))){
                System.out.println("Room number " + rooms.get(a).getRoom() + " matches your requirements");
                roomsAvailable = true;
                
            }
        }
        if(roomsAvailable == false){
            System.out.println("There aren't any rooms available that match your requirements");
        }
    }
}
