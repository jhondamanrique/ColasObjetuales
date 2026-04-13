import java.util.Queue;

public class Metodos {
    public Queue<Cliente> EncolarCliente(Queue<Cliente> cola, Cliente cliente){
        cola.add(cliente);
        System.out.println("Cliente "+ cliente.getNombre()+ " agregado a la cola");
        return cola;
    }

    public Cliente AtenderCliente(Queue<Cliente> cola){
        if (cola.isEmpty()){
            System.out.println("No hay clientes en cola");
            return null;
        }

        Cliente atendido = cola.poll();
        atendido.setAtendido(true);
        System.out.println("Cliente atendido: ");
        System.out.println(atendido);
        return atendido;
    }

    public void VerSiguienteCliente(Queue<Cliente> cola){
        if (cola.isEmpty()){
            System.out.println("No hay clientes en la cola");
        }else{
            System.out.println("Proximo cliente en ser atendido: ");
            System.out.println(cola.peek());
        }
    }

    public void MostrarCola(Queue<Cliente> cola){
        if (cola.isEmpty()){
            System.out.println("No hay clientes en la cola");
            return;
        }
        System.out.println("\n---------- Clientes en espera ----------");
        for (Cliente cliente : cola){
            System.out.println(cliente);
        }
    }

    public void MostrarTurnos(Queue<Cliente> pendientes, Queue<Cliente> atendidos){
            System.out.println("\n---------- Turnos Pendientes ----------");
            if (pendientes.isEmpty()){
                System.out.println("No hay turnos pendientes");
            }else{
                for (Cliente cliente : pendientes){
                    System.out.println(cliente);
                }
            }
            System.out.println("\n---------- Turnos Atendidos ----------");
            if (atendidos.isEmpty()){
                System.out.println("No hay clientes atendidos");
            }else{
                for (Cliente Cliente: atendidos){
                    System.out.println(Cliente);
                }
            }
    }
}

