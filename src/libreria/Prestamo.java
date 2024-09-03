package libreria;

import java.util.Date;

public class Prestamo {
    private int id;
    private Date fecha;
    
    public String getDetalle(){
        String detalles = "id: " + id + " fecha :" + fecha;
        System.out.println(detalles);
        return detalles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
