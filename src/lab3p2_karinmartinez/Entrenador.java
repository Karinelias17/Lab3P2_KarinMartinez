
package lab3p2_karinmartinez;


public class Entrenador {
    //Atributos
    public String nombre, sexo, tipo,edad;
    
    //constructores
    public Entrenador(){
    }
    
    public Entrenador(String nombre, String edad, String sexo, String tipo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.tipo=tipo;
    }
    // mutadores
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(String edad){
        this.edad=edad;
    }
    
    public String getEdad(){
        return edad;
    }
    
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    //metodos de ADM
    @Override
    public String toString(){
        return nombre+ " " + edad+ " "+ sexo;
    }
}
