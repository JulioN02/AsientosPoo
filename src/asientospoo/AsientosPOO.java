package asientospoo;

import asientospoo.logica.Ticket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//import java.util.Scanner;

public class AsientosPOO {

    public static void main(String[] args) {
        //Declarar lista y asignar un ArrayList de tipo Ticket (polimorfismo)
        //Estructura
        
        List ListaTickets = new ArrayList<Ticket>();
        

        //Utilizar constructores de la clase
        Ticket ticket1 = new Ticket(12, 2, 3, 1500, new Date(), new Date());
        Ticket ticket2 = new Ticket(13, 2, 3, 1500, new Date(), new Date());

        //Utilizar constructor vacio y asignar con setter los datos (encapsulamiento)
        Ticket ticket3 = new Ticket();
        ticket3.setNumero(20);
        ticket3.setfila(5);
        ticket3.setAsiento(1);
        ticket3.setPrecio(3000);
        ticket3.setfechaCompra(new Date());
        ticket3.setfechaValidez(new Date());

        //Agregar los tickkets a la estructura
        ListaTickets.add(ticket1);
        ListaTickets.add(ticket2);
        ListaTickets.add(ticket3);

        //Suma de Precios
        double suma = 0;
        /*for(Ticket ticket : ListaTickets) {
            suma = suma + ticket.getPrecio();
        }
        
        System.out.println("La suma de precios es de: "+suma);
        
        //Pedir fila a usuario
        System.out.println("Ingrese la fila de la que desea ver tickets");
        Scanner sc = new Scanner(System.in);
        int fila = sc.nextInt();
        for (Ticket tick : ListaTickets){
            if (tick.getfila()==fila){
                System.out.println("Num Ticket: "+tickgetNumero());
            }
        }
*/
    }

}
