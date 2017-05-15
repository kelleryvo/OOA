import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person organisator = new Person("Dennis", "Schäppi");
        Party party1 = new Party("20.05.2017", "Wetzikon", organisator);

        ArrayList<Person> guests = new ArrayList<>();
        guests.add(new Person("Yvo", "Keller"));

        party1.inviteGuests(guests);
    }
}
