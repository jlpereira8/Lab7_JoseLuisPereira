
package lab7_joseluispereria;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class hilos extends Thread{
    private JTable tabla;
    piezas principal;
    ArrayList<piezas>lista=new ArrayList();

    public hilos(JTable tabla, piezas principal) {
        this.tabla = tabla;
        this.principal = principal;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public piezas getPrincipal() {
        return principal;
    }

    public void setPrincipal(piezas principal) {
        this.principal = principal;
    }
   

    public ArrayList<piezas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<piezas> lista) {
        this.lista = lista;
    }
    
    //@Override
    public void correr(){
        System.out.println("corre");
        for (piezas o : lista) { 
            try{
                double e=o.getTiempo();
                long j=(long)e;
                Thread.sleep(j);
            }catch(Exception e){
                e.printStackTrace();
            }       
            Object [] newrow={principal.getNombre(),o.getNombre(),o.getTiempo()};
            DefaultTableModel modelo=(DefaultTableModel) tabla.getModel();
            modelo.addRow(newrow);
            tabla.setModel(modelo);
            
        }
    }
    
    
}
