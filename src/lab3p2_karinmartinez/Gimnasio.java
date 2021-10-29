
package lab3p2_karinmartinez;


public class Gimnasio {
    //Atributos
    public String nombre, ciudad, lider, victorias, derrotas, dinero;
    
    //Constructores
    public Gimnasio(){
    }
    
    public Gimnasio(String nombre, String ciudad, String lider, String victorias, String derrotas,String dinero){
        this.nombre=nombre;
        this.ciudad=ciudad;
        this.lider=lider;
        this.victorias=victorias;
        this.derrotas=derrotas;
        this.dinero=dinero;
    }
    // mutadores
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    public void setLider(String lider){
        this.lider=lider;
    }
    
    public String getLider(){
        return lider;
    }
    
    public void setVictorias(String victorias){
        this.victorias=victorias;
    }
    
    public String getVictorias(){
        return victorias;
    }
    
    public void setDerrotas(String derrotas){
        this.derrotas=derrotas;
    }
    
    public String getDerrotas(){
        return derrotas;
    }
    
    public void setDinero(String dinero){
        this.dinero=dinero;
    }
    
    public String getDinero(){
        return dinero;
    }
    
    //metodos de ADM
    @Override
    public String toString(){
        return nombre+ " " + ciudad+ " "+ lider+" "+ victorias+" "+ derrotas+" "+ dinero;
    }
}
