package git;

public class PATO {
    public Boolean cola;
    public Integer patas;
    public Double DBSonido;
    public String raza;

    public PATO() {
    }

    public PATO(Boolean cola, Integer patas, Double DBSonido, String raza) {
        this.cola = cola;
        this.patas = patas;
        this.DBSonido = DBSonido;
        this.raza = raza;
    }

    public Boolean getCola() {
        return cola;
    }

    public void setCola(Boolean cola) {
        this.cola = cola;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public Double getDBSonido() {
        return DBSonido;
    }

    public void setDBSonido(Double DBSonido) {
        this.DBSonido = DBSonido;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "PATO{" + "cola=" + cola + ", patas=" + patas + ", DBSonido=" + DBSonido + ", raza=" + raza + '}';
    }
    
}