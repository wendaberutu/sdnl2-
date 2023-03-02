
package pohonBinary;

public class treeNode {
    int key; 
    treeNode kiri, kanan;

    public treeNode(int key) {
        this.key = key;
    }
    public treeNode(){
        
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
        

    public treeNode getKiri() {
        return kiri;
    }

    public void setKiri(treeNode kiri) {
        this.kiri = kiri;
    }

    public treeNode getKanan() {
        return kanan;
    }

    public void setKanan(treeNode kanan) {
        this.kanan = kanan;
    }
    
}
