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

    }

    public void accept(){
        setAccepted(true);
    }
    public void decline(){
        setAccepted(false);
    }

    //Get & Set
    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
}
