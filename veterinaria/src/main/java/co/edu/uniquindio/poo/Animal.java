package co.edu.uniquindio.poo;

public class Animal {
    public String nombre;
    public String edad;
    public String peso;
    public String tipoAnimal;



    public Animal(String nombre, String edad, String peso, String tipoAnimal) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tipoAnimal = tipoAnimal;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getEdad() {
        return edad;
    }



    public void setEdad(String edad) {
        this.edad = edad;
    }



    public String getPeso() {
        return peso;
    }



    public void setPeso(String peso) {
        this.peso = peso;
    }



    public String getTipoAnimal() {
        return tipoAnimal;
    }



    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    

    
    
}
