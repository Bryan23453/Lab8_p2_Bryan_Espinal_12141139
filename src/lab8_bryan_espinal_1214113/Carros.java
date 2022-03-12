/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_bryan_espinal_1214113;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author bryan
 */
public class Carros implements Serializable{
    String Nombre;
    Color col;
    int numero;
    int tipo;
    int distancia;

    public Carros() {
    }

    public Carros(String Nombre, Color col, int numero,int tipo) {
        this.Nombre = Nombre;
        this.col = col;
        this.numero = numero;
        this.tipo=tipo;
        this.distancia=0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Color getCol() {
        return col;
    }

    public void setCol(Color col) {
        this.col = col;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia += distancia;
    }

    @Override
    public String toString() {
        return "gana el carro " +  numero +"Conducido Por "+Nombre+" con una Distancia Recorrida de "+distancia+" Kilometros";
    }
    
}
