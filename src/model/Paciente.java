package model;

import java.util.ArrayList;

public class Paciente {
    private String nombre;
    private int edad;
    private ArrayList <Sintoma> listaSintomas;

    public Paciente(String nombre, int edad, ArrayList<Sintoma> listaSintomas) {
        this.nombre = nombre.toLowerCase().trim();
        this.edad = edad;
        this.listaSintomas = listaSintomas;
    }
    
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public ArrayList<Sintoma> getListaSintomas() {
        return listaSintomas;
    }

    @Override
    public String toString() {
        return   nombre + " - " + edad + " - " + listaSintomas;
    }

}
