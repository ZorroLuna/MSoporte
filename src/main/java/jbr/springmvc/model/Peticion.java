/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jbr.springmvc.model;

/**
 *
 * @author Enrique Luna Jimenez
 */

public class Peticion {    
    private Long idPeticion;
    
    private String descripcion;
    private String status;
    private int prioridad;
    private String emisor;
    private String asignado;

    public Long getIdPeticion() {
        return idPeticion;
    }

    public void setIdPeticion(Long idPeticion) {
        this.idPeticion = idPeticion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getAsignado() {
        return asignado;
    }

    public void setAsignado(String asignado) {
        this.asignado = asignado;
    }
    
    
    
    
}
