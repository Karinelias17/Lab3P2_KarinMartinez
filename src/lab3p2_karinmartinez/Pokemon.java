
package lab3p2_karinmartinez;

public class Pokemon {
    //Atributos
    public String nombre, tipo;
    public int ataque, vida;
    
    //constructores
    public Pokemon(){
    }
    
    public Pokemon(String nombre, int ataque, int vida, String tipo){
        this.nombre=nombre;
        this.ataque=ataque;
        this.vida=vida;
        this.tipo=tipo;
    }
    // mutadores
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setAtaque(int ataque){
        this.ataque=ataque;
    }
    
    public int getAtaque(){
        return ataque;
    }
    public void setVida(int vida){
        this.vida=vida;
    }
    
    public int getVida(){
        return vida;
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
        return nombre+ " " + ataque+ " "+ vida+ " " + tipo;
    }
}
