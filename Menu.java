import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Validaciones v = new Validaciones();
        Queue<Cliente> ColaPendiente = new LinkedList<>();
        Queue<Cliente> ColaAtendidos = new LinkedList<>();

        Boolean Seguir = true;
        int opt = 0;
        int ContadorTurno = 1;

        while (Seguir){
            System.out.println("\n========== GESTION DE TURNOS  ========");
            System.out.println("1) Llegada de cliente");
            System.out.println("2) Atender Cliente");
            System.out.println("3) Ver siguiente cliente");
            System.out.println("4) Ver cola actual");
            System.out.println("5) Mostrar turnos atendidos y pendientes");
            System.out.println("6) Salir");
            System.out.println("Seleccione una opcion: ");
            opt = v.ValidarEntero(sc);

            switch (opt) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente: ");
                    String Nombre = sc.nextLine();
                    System.out.println("Ingrese el tipo de servicio (Retiro/Consignacion/Asesoria): ");
                    String TipoServicio = sc.nextLine();
                    Cliente cliente = new Cliente(ContadorTurno, Nombre, TipoServicio);
                    ContadorTurno++;
                    ColaPendiente = m.EncolarCliente(ColaPendiente, cliente);
                break;
                case 2:
                    Cliente atendido = m.AtenderCliente(ColaPendiente);
                    if (atendido != null){
                        ColaAtendidos.add(atendido);
                    }
                break;
                case 3:
                    m.VerSiguienteCliente(ColaPendiente);
                break;
                case 4:
                    m.MostrarCola(ColaPendiente);
                break;
                case 5:
                    m.MostrarTurnos(ColaPendiente, ColaAtendidos);
                break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    Seguir = false;
                break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente");
            }
            
        }
    }
}
