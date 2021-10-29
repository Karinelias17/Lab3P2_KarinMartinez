
package lab3p2_karinmartinez;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class Lab3P2_KarinMartinez {

    public static void main(String[] args) {
        ArrayList <Entrenador> gimnasios =new ArrayList();
        ArrayList <Entrenador> entrenadores =new ArrayList();
        ArrayList <Pokemon> pokemones =new ArrayList();
        int opcion =0;
        String nombre,ciudad,nombregim,sexo,tipo,edad;
        int victorias,derrotas,dinero,ataque,vida;
        while (opcion != 10){
            opcion=Integer.parseInt(
            JOptionPane.showInputDialog("1- Crear Gimnasio\n2- Modificar Gimnasios\n3- Eliminar Gimnasios\n4- Listar Gimnasios\n5- Crear Entrenador\n6- Eliminar Entrenador\n7- Listar Entrenadores\n8- Crear pokemon\n9- Pelea\n10- Salir")
            );
            
            if (opcion == 1){
                nombregim=JOptionPane.showInputDialog("Ingrese el nombre del gimnasio");
                ciudad=JOptionPane.showInputDialog("Ingrese la ciudad del gimnasio");
                dinero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero del gimnasio"));
                nombre=JOptionPane.showInputDialog("Ingrese del lider");
                edad=JOptionPane.showInputDialog("Ingrese la edad del lider");
                sexo=JOptionPane.showInputDialog("Ingrese el sexo del lider");
                tipo = "Maestro Pokemon";
                victorias = 0;
                derrotas =0;
                
                entrenadores.add(new Entrenador(nombre,edad,sexo,tipo));
                gimnasios.add(new Gimnasio(nombregim,ciudad,entrenadores.get(0),victorias, derrotas,dinero));
            }else if (opcion ==2){
                int pos;
                pos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posion en la lista del gimnasio que desea editar"));
                String m;
                int n;
                m=JOptionPane.showInputDialog("ingrese el nuevo nombre");
                (gimnasios.get(pos)).setNombre(m);
                m=JOptionPane.showInputDialog("ingrese la nueva ciudad");
                (gimnasios.get(pos)).setCiudad(m);
                n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el nuevo numero de victorias"));
                (gimnasios.get(pos)).setVictorias(m);
                n=Integer.parseInt(JOptionPane.showInputDialog("ingrese el nuevo numero de derrotas"));
                (gimnasios.get(pos)).setDerrotas(m);
                n=Integer.parseInt(JOptionPane.showInputDialog("ingrese la nueva cantidad de dinero"));
                (gimnasios.get(pos)).setDinero(m);
            }else if (opcion ==3){
                int pos;
                pos=Integer.parseInt(
                JOptionPane.showInputDialog("Indique la posicion a eliminar de la lista")
                );
                gimnasios.remove(pos);
                JOptionPane.showMessageDialog(null, "gimnasio eliminado exitosamente");
            }else if (opcion == 4){
                String salida="";
                for (Object o: gimnasios) {
                    salida += gimnasios.indexOf(o)+"- "+o+"\n";
                }
                JOptionPane.showMessageDialog(null, salida);
            }else if (opcion == 5){
                nombre=JOptionPane.showInputDialog("Ingrese el nombre del nuevo entrenador");
                edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del nuevo entrenador"));
                sexo=JOptionPane.showInputDialog("Ingrese el sexo del nuevo entrenador");
                tipo = JOptionPane.showInputDialog("Ingrese el tipo de entrenador");
                entrenadores.add(new Entrenador(nombre,edad,sexo,tipo));
            }else if (opcion == 6){
                int pos;
                pos=Integer.parseInt(
                JOptionPane.showInputDialog("Indique la posicion a eliminar de la lista")
                );
                entrenadores.remove(pos);
                JOptionPane.showMessageDialog(null, "entrenador eliminado exitosamente");
            }else if (opcion ==7){
                String salida="";
                for (Object o: entrenadores) {
                    salida += entrenadores.indexOf(o)+"- "+o+"\n";
                }
                JOptionPane.showMessageDialog(null, salida);
            }else if (opcion ==8){
                nombre=JOptionPane.showInputDialog("Ingrese el nombre del nuevo Pokemon");
                ataque =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ataque del nuevo pokemon"));
                vida =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida del nuevo pokemon"));
                tipo = JOptionPane.showInputDialog("Ingrese el tipo del nuevo Pokemon");
                pokemones.add(new Pokemon(nombre,ataque,vida,tipo));
            }else if (opcion ==9){
                
            }
            
        }
    }
    
}
