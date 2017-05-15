import java.util.ArrayList;
import java.util.Date;

/**
 * Created by yvokeller on 15.05.17.
 */
public class Party {
    //Attribute
    private String date;
    private String ort;

    private Person gastgeber;
    private ArrayList<Invitation> invitations = new ArrayList<>();

    //Constructor
    public Party(String date, String ort, Person gastgeber){
        this.date = date;
        this.ort = ort;

        this.gastgeber = gastgeber;

        System.out.println("New party created. Date: " + date + " Ort: " + ort + " Organisator: " + gastgeber.getVorname() + " " + gastgeber.getNachname());
    }

    //Function
    public void inviteGuests(ArrayList<Person> guests){
        for(Person guest : guests){
            Invitation inv = new Invitation(guest);
            invitations.add(inv);
            inv.send();
        }
    }

    public void whoComes(){
        for(Invitation inv : invitations){
            if(inv.isAccepted()){
                System.out.println("Accepted: " + inv.getPerson().getVorname() + " " + inv.getPerson().getNachname());
            }
        }

        for(Invitation inv : invitations){
            if(!(inv.isAccepted())){
                System.out.println("Declined: " + inv.getPerson().getVorname() + " " + inv.getPerson().getNachname());
            }
        }
    }

    //Get & Set

}
