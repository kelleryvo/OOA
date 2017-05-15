import java.util.Scanner;

/**
 * Created by yvokeller on 15.05.17.
 */
public class Invitation {
    //Attribute
    private Person person;
    private boolean accepted;
    private String message;

    //Constructor
    public Invitation(Person person){
        this.person = person;
    }

    //Functions
    public void send(){
        Scanner scanner = new Scanner(System.in);

        boolean answer;
        System.out.println("Would you like to participate at " + person.getVorname() + " " + person.getNachname() + "'s Party?");
        answer = scanner.nextBoolean();

        if(answer == true){
            accept();
        } else {
            decline();
        }
    }

    public void accept(){
        setAccepted(true);
        System.out.println(person.getVorname() + " " + person.getNachname() + " has accepted the invitation");
    }
    public void decline(){
        setAccepted(false);
        System.out.println(person.getVorname() + " " + person.getNachname() + " declined the invitation");
    }

    //Get & Set
    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public Person getPerson(){
        return person;
    }
}
