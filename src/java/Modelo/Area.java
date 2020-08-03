/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JORGE HOYOS
 */
public class Area {
    private int idarea;
    private String nombre;
    private String tipo;
    private String sugerencia;
    private String estado;

    public Area() {
    }

    public Area(int idarea, String nombre, String tipo, String sugerencia, String estado) {
        this.idarea = idarea;
        this.nombre = nombre;
        this.tipo = tipo;
        this.sugerencia = sugerencia;
        this.estado = estado;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    
}
