/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import pilas.Pila;

/**
 *
 * @author Noemí
 */
public class PanelPila extends javax.swing.JPanel {

    public int x=20;
    public int y=100;
    public Pila pila;
    
    /**
     * Creates new form PanelPila
     * @param p
     */
    public PanelPila(Pila p) {
        initComponents();
        pila = p;
    }

    @Override
    public void paintComponent(Graphics g){
  super.paintComponents(g);
  Graphics2D g2d=(Graphics2D)g;
  g2d.setColor(Color.WHITE);
  g2d.fillRect(0,0,400,200);
  g2d.setColor(Color.BLACK);
  g2d.setStroke(new BasicStroke(2));
  g2d.drawString("tope",2*x+10, y-10 );
  for(int i=0;i<pila.size();i++){
   if(i!=0){
    g2d.drawLine(2*x*(i+1)-10, y+15, 2*x*(i+1), y+15);
   }
   g2d.drawRoundRect(2*x*(i+1), y, 30, 30, 10, 10);
   g2d.drawString(""+pila.getNodos().get(i), 2*x*(i+1)+12, y+20);
  }
  
  
 }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
