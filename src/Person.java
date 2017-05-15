/**
 * Created by yvokeller on 15.05.17.
 */
public class Person {
    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname(){
        return this.vorname;
    }

    public String getNachname(){
        return this.nachname;
    }
}
