package Pratikum14;

public class BinaryTreeMain07 {
    public static void main(String[] args) {

        BinaryTree07 bst = new BinaryTree07();

        bst.add(new Mahasiswa07("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa07("244160211", "Badar", "B", 3.85));
        bst.add(new Mahasiswa07("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa07("244160220", "Dewi", "D", 3.54));

        System.out.println("\nDaftar semua mahasiswa (InOrder Traversal)");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa");

        System.out.print("Cari mahasiswa dengan IPK 3.54 : ");
        System.out.println(
                bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan"
        );

        System.out.print("Cari mahasiswa dengan IPK 3.22 : ");
        System.out.println(
                bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan"
        );

        bst.add(new Mahasiswa07("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa07("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa07("244160170", "Fifi", "B", 3.46));

        System.out.println("\nDaftar mahasiswa setelah penambahan 3 mahasiswa");

        System.out.println("\nPreOrder Traversal");
        bst.traversePreOrder(bst.root);

        System.out.println("\nInOrder Traversal");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPostOrder Traversal");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);

        System.out.println("\nDaftar mahasiswa setelah penghapusan");

        bst.traverseInOrder(bst.root);
    }
}