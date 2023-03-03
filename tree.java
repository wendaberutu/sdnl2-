package pohonBinary;
import java.util.LinkedList;
import java.util.Queue;

public class tree {

    treeNode root;

    public tree() {
        root=null;
    }

    public treeNode getRoot() {
        return root;
    }

    public void setRoot(treeNode root) {
        this.root = root;
    }
   private treeNode insert(treeNode node, int data){
       if(node == null){
           node= new treeNode(data);
       }else {
           if(data<= node.getKey()){
               node.setKiri(insert(node.getKiri(),data));
           }else {
               node.setKanan(insert(node.getKanan(),data));
           }
       }
       return node;
   }

    public void insert(int data) {
        this.root = insert(this.root, data);
        
//        treeNode n = new treeNode(data);
//        if (getRoot() == null) {
//            setRoot(n);
//        } else {
//            treeNode parent = getRoot();
//            treeNode point = getRoot();
//            while (point != getRoot()) {
//                if (data < point.getKey()) {
//                    point = point.getKiri();
//                } else if (data >= point.getKey()) {
//                    point = point.getKanan();
//                }
//            }
//            if (data < parent.getKey()) {
//                parent.setKiri(n);
//            } else {
//                parent.setKanan(n);
//            }
//        }
    }

    public treeNode search(int kunci) {
        treeNode pilih = root;
        while (pilih != null) {
            if (kunci == pilih.getKey()) {
                return pilih;
            } else if (kunci > pilih.getKey()) {
                pilih = pilih.getKanan();
            } else if (kunci < pilih.getKey()) {
                pilih = pilih.getKiri();
            }

        }
        return null;
    }

    public void postOrder(treeNode localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.kiri);
            postOrder(localRoot.kanan);
            System.out.println(localRoot.key + " ");
        }
    }

    public void preOrder() {
    preOrder(this.root);
    }
    private void preOrder(treeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getKey() + " ");
            preOrder(localRoot.getKiri());
            preOrder(localRoot.getKanan());
        }
    }
  public void inorder(){
      inOrder(this.root);
  }
    
  private   public void inOrder(treeNode localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.kiri);
            System.out.println(localRoot.key + " ");
            inOrder(localRoot.kanan);
        }
    }

    public void levelOrder() {
        if (root == null) {
            return;
        }
        Queue<treeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            treeNode node = queue.poll();
            System.out.println(node.getKey() + " ");
            if (node.getKiri() != null) {
                queue.add(node.getKiri());
            } else if (node.getKanan() != null) {
                queue.add(node.getKanan());
            }
        }

    }

}
