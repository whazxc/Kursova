import java.time.LocalDate;

public class Main {
    static Room [] room = new Room[5];
    static Checkin [] ch = new Checkin[5];

    public static void main(String[] args) {
        for(int a = 0; a < room.length; a++){
            room[a] = new Room();
        }
        room[0].setBeds(2);
        room[1].setBeds(2);
        room[2].setBeds(2);
        room[3].setBeds(2);
        room[4].setBeds(2);
        for(int a = 0; a < room.length; a++){
            room[a].setRoom(a+1);
        }
        ch[0] = new Checkin(room[0], LocalDate.of(2022, 3, 5), LocalDate.of(2022, 4, 5),"Lores");
        ch[1] = new Checkin(room[1], LocalDate.of(2021, 5, 5), LocalDate.of(2021, 6, 23),"Lores");
        ch[2] = new Checkin(room[2], LocalDate.of(2023, 8, 5), LocalDate.of(2024, 4, 5),"Lores");
        ch[3] = new Checkin(room[3], LocalDate.of(2013, 3, 5), LocalDate.of(2014, 4, 5),"Lores");
        ch[4] = new Checkin(room[4], LocalDate.of(2022, 3, 5), LocalDate.of(2022, 4, 5),"Lores");

        LocalDate date1 = LocalDate.of(2022,3,5);
        Availability(date1);
    }

    public static void Availability(LocalDate date){
        for(int a = 0; a < room.length; a++){
            if(date.isAfter(ch[a].getTo()) || date.isBefore(ch[a].getFrom())){
                System.out.println("Room " + ch[a].getRoom() + " is available on " + date);
            }
        }
    }
}