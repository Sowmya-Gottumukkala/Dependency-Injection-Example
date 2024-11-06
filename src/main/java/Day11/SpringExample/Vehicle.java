package Day11.SpringExample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Vehicle {
    private String vno;
    private String vname;
    private Engine engine;

    public String getVno() {
        return vno;
    }

    public void setVno(String vno) {
        this.vno = vno;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public Engine getEngine() {
        return engine;
    }

    @Autowired
 
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}