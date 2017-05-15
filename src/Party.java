import java.util.ArrayList;
import java.util.Date;

/**
 * Created by yvokeller on 15.05.17.
 */
public class Party {
    //Attribute
    private String date;
    private String ort;

    private Gastgeber gastgeber;
    private ArrayList<Invitation> invitations = new ArrayList<>();

    //Constructor
    public Party(String date, String ort){
        this.date = date;
        this.ort = ort;
    }

    //Function
    public void inviteGuests(ArrayList<Person> guests){
        for(Person guest : guests){
            Invitation inv = new Invitation(guest);
            invitations.add(inv);

            inv.send();
        }
    }

    //Get & Set

}
