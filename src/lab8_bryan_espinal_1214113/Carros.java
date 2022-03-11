/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_bryan_espinal_1214113;

import java.awt.Color;

/**
 *
 * @author bryan
 */
public class Carros {
    String Nombre;
    Color col;
    int numero;

    public Carros() {
    }

    public Carros(String Nombre, Color col, int numero) {
        this.Nombre = Nombre;
        this.col = col;
        this.numero = numero;
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
    
}
