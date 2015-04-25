import java.io.Serializable;
import java.util.List;

/**
 * Created by damien on 24/04/15.
 */
public class Mod implements Serializable{

    private static final long serialVersionUID = 1L;

    protected int id;
    protected String name;
    protected List<String> dependance;

    //Constructor
    public Mod() {
    }

    public Mod(int id, String name, List<String> dependance) {
        this.id = id;
        this.name = name;
        this.dependance = dependance;
    }

    // Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDependance() {
        return dependance;
    }

    public void setDependance(List<String> dependance) {
        this.dependance = dependance;
    }

    @Override
    public String toString() {
        return "id : "+id+" - name : "+name;
    }
}
