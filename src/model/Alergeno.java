package model;

import java.util.ArrayList;

public class Alergeno {
    private String nombre;
    private String categoria;
    private ArrayList<Sintoma> listaSintomas;
    private ArrayList<String> listaRecomendaciones;

    public Alergeno(String nombre, String categoria, ArrayList<Sintoma> listaSintomas,
            ArrayList<String> listaRecomendaciones) {
        this.nombre = nombre.toLowerCase().trim();
        this.categoria = categoria.toLowerCase().trim();
        this.listaSintomas = listaSintomas;
        this.listaRecomendaciones = listaRecomendaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public ArrayList<Sintoma> getListaSintomas() {
        return listaSintomas;
    }

    public ArrayList<String> getListaRecomendaciones() {
        return listaRecomendaciones;
    }

    @Override
    public String toString() {
        return nombre + " - " + categoria + " - " + listaSintomas + " - " + listaRecomendaciones;    }

}
