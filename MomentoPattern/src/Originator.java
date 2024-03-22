import java.lang.management.MonitorInfo;

public class Originator {

    private String name;

    private String email;

    public Originator(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Momento createMomento(){

        return new Momento(this.name, this.email);
    }

    public void restoreFromMomento(Momento momento){
        this.name = momento.getName();
        this.email = momento.getEmail();
    }
}
