package newpackage;

import javax.swing.table.DefaultTableModel;

public class Brg {
    private DefaultTableModel tabel = new DefaultTableModel();
    
    public Brg(){
        getTabel().addColumn("Nama");
        getTabel().addColumn("RAM");
        getTabel().addColumn("Harga");
        getTabel().addColumn("Stok");
    }

    public DefaultTableModel getTabel() {
        return tabel;
    }

    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
    
}
