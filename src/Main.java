import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person organisator = new Person();
        Party party1 = new Party("20.05.2017", "Wetzikon", organisator);

        ArrayList<Person> guests = new ArrayList<>();

        party1.inviteGuests();

    }
}
