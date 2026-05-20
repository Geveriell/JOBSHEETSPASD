package casemethod2;

class ListPesanan07 {
    NodePesanan07 head;
    NodePesanan07 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(int kode, String nama, int harga) {
        Pesanan07 p = new Pesanan07(kode, nama, harga);
        NodePesanan07 newNode = new NodePesanan07(p);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortPesanan() {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            NodePesanan07 current = head;

            while (current.next != null) {
                if (current.data.namaPesanan
                        .compareToIgnoreCase(current.next.data.namaPesanan) > 0) {

                    Pesanan07 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void cetakPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        sortPesanan();

        NodePesanan07 tmp = head;
        int total = 0;

        System.out.println("\n=== LAPORAN PESANAN (URUT NAMA) ===");
        System.out.println("Kode | Nama Pesanan | Harga");

        while (tmp != null) {
            System.out.println(tmp.data.kodePesanan + " | "
                    + tmp.data.namaPesanan + " | "
                    + tmp.data.harga);
            total += tmp.data.harga;
            tmp = tmp.next;
        }

        System.out.println("Total Pendapatan: " + total);
    }
}