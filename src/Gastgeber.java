/**
 * Created by denni on 15.05.2017.
 */
public class Gastgeber extends Person {

    private Party party;

    public Gastgeber(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public void createParty(){

    }

    public Party getParty(){
        return this.party;
    }
}
