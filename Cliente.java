
import java.time.LocalDateTime;

public class Cliente {
    private int Id;
    private String Nombre;
    private String TipoServicio;
    private LocalDateTime HoraLlegada;
    private Boolean Atendido;
    
    public Cliente(int Id, String Nombre, String TipoServicio) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.TipoServicio = TipoServicio;
        this.HoraLlegada = LocalDateTime.now(); // Hora actual al crear el cliente
        this.Atendido = false; // Inicialmente no atendido
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTipoServicio() {
        return TipoServicio;
    }

    public LocalDateTime getHoraLlegada() {
        return HoraLlegada;
    }

    public Boolean isAtendido() {
        return Atendido;
    }

    public void setAtendido(Boolean Atendido) {
        this.Atendido = Atendido;
    }

    @Override
    public String toString() {
        return "Turno: " + Id +
                "| Nombre: " + Nombre +
                "| Servicio: " + TipoServicio +
                "| Hora de Llegada: " + HoraLlegada +
                "| Atendido: " + Atendido;
    }



    
}
