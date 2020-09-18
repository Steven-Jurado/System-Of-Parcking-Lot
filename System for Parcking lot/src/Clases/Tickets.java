
package Clases;
// corregir 
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Tickets {
    static String Hora, Minuto, Segundo, fecha, estado;
    private String id;
    public static Date HoraEntrada;
    private static Date fechaEntrada;
    
    public Tickets(String id) {
        this.id = id;
        hora();
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static Date getHoraEntrada() {
        return HoraEntrada ;
    }

    public static void setHoraEntrada(Date HoraEntrada) {
        Tickets.HoraEntrada = HoraEntrada;
    }

    public static Date getFechaEntrada() {
        return  fechaEntrada ;
    }

    public static void setFechaEntrada(Date fechaEntrada) {
        Tickets.fechaEntrada = fechaEntrada;
    }
    
    public void RealizarTicket(){
        getId();
        getFechaEntrada();
        getHoraEntrada();
        
        
    }
    
    public void ModificarTicket(String Id, Date HoraEntrada, Date FechaEntrada){
        setFechaEntrada(FechaEntrada);
        setHoraEntrada(HoraEntrada);
        setId(Id);
    }
    
    public void hora (){
        HoraEntrada = new Date();
        Calendar Fecha = new GregorianCalendar();
        Fecha.setTime(HoraEntrada);
        Hora = Integer.toString(Fecha.get(Calendar.HOUR_OF_DAY));
        Minuto = Integer.toString(Fecha.get(Calendar.MINUTE));
        Segundo = Integer.toString(Fecha.get(Calendar.SECOND));
        estado = Integer.toString(Fecha.get(Calendar.AM_PM));
        fecha = Hora+":"+Minuto+":"+Segundo;
    }
}
