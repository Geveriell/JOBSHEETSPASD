package Pertemuan12;

public class SLLMain07 {
    public static void main(String[] args) {

        SingleLinkedList07 sll = new SingleLinkedList07();

        Mahasiswa07 mhs1 = new Mahasiswa07("22212202", "Cintia", "3C", 3.5);
        Mahasiswa07 mhs2 = new Mahasiswa07("23212201", "Bimon", "2B", 3.8);
        Mahasiswa07 mhs3 = new Mahasiswa07("22212208", "Alvaro", "1A", 4.0);
        Mahasiswa07 mhs4 = new Mahasiswa07("21212203", "Digna", "4D", 3.6);

        sll.print();

        sll.addFirst(mhs4);
        sll.print();

        sll.addLast(mhs1);
        sll.print();

        sll.insertAfter("Digna", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data Bimon di index : " + sll.indexOf("Bimon"));

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}