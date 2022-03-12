/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_bryan_espinal_1214113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bryan
 */
    public class hilo extends Thread{
    private JProgressBar barra;
    private boolean vive;
    int tam;
    JTable tablita;
    Carros b;
    ArrayList<Carros> a=new ArrayList();
    Random r=new Random();
    public hilo(JProgressBar barra, ArrayList a,int tam,JTable A) {
        this.barra = barra;
        vive=true;
        this.a=a;
        this.tablita=A;
        this.tam=tam;
    }
    
    public boolean getVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }


    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run(){
        boolean passss=true;
        while(vive){
                for (int i = 0; i < a.size(); i++) {
                    int tip=a.get(i).getTipo();
                    switch (tip){
                        case 0:{
                            a.get(i).setDistancia(30+r.nextInt(190));
                        }
                        break;
                        case 1:{
                            a.get(i).setDistancia(20+r.nextInt(200));
                        }
                        break;
                        case 2:{
                            a.get(i).setDistancia(40+r.nextInt(180));

                        }

                    }
                }
                try {
                    barra.setValue(a.get(tablita.getSelectedRow()).getDistancia());
                } catch (Exception e) {} 
                for (int i = 0; i < a.size(); i++) {
                    tablita.setValueAt(a.get(i).getDistancia(), i,2  );
                }
                
               /* Object[] osb=new Object[tablita.getRowCount()];
                int t=0;
                for (int i = 0; i < tablita.getRowCount(); i++) {
                        osb[t]=tablita.getValueAt(i, 2);  
                        t++;
                    
                }
                Arrays.sort(osb, Collections.reverseOrder());
                for (int i = 0; i < osb.length; i++) {
                System.out.println(osb[i]);
            }*/
                
                
                try {
                    barra.setValue(a.get(tablita.getSelectedRow()).getDistancia());
                    System.out.println(tablita.getSelectedRow());
                } catch (Exception e) {}  
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
                for (Carros carros : a) {
                    if (carros.getDistancia()>tam) {
                        vive=false;
                    }
                } 
        }
            int pass=0;
            for (Carros carros : a) {
                if (carros.getDistancia()>pass) {
                    pass=carros.getDistancia();
                    b=carros;
                }
            }
            JOptionPane.showMessageDialog(tablita, b.toString());   
    }
}

    


