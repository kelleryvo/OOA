/**
 * Created by yvokeller on 15.05.17.
 */
public class Invitation {
    private Person person;
    private boolean accepted;
    private String message;

    public void send(){

    }

    public void accept(){
        setAccepted(true);
    }
    public void decline(){
        setAccepted(false);
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
}