/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_bryan_espinal_1214113;

import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JTable;

/**
 *
 * @author bryan
 */
    public class hilo extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    int tam;
    JTable tablita;
    ArrayList<Carros> a=new ArrayList();
    public hilo(JProgressBar barra, ArrayList a,int tam,JTable A) {
        this.barra = barra;
        avanzar=true;
        vive=true;
        this.a=a;
        this.tablita=A;
    }
    
    public boolean getVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }


    public boolean getAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }


    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
       barra.setValue(6);
       try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
       barra.setValue(10);
        while(vive){
            if(avanzar){
                
                barra.setValue(a.get(tablita.getSelectedRow()).getDistancia());
                if(barra.getValue()==tam){
                    vive=false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }

    
}

