package co.edu.uniquindio.poo;

public class Domestico extends Animal {

    private String raza;
    private String color;

    public Domestico(String nombre, String edad, String peso, String tipoAnimal,String raza,String color) {
        super(nombre, edad, peso, tipoAnimal);
        this.raza=raza;
        this.color=color;
        
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    
}
