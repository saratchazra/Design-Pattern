import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Momento> history;

    public CareTaker(){
        this.history = new ArrayList<>();
    }

    public void add(Momento momento){
        this.history.add(momento);
    }

    public Momento get(int index){
        return this.history.get(index);
    }
}
