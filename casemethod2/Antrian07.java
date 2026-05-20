package casemethod2;

class Antrian07 {
    NodePembeli07 head;
    NodePembeli07 tail;
    int nomor = 6;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(String nama, String noHp) {
        nomor++;
        Pembeli07 pembeli = new Pembeli07(nama, noHp);
        NodePembeli07 newNode = new NodePembeli07(nomor, pembeli);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomor);
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        NodePembeli07 tmp = head;
        System.out.println("\n=== DAFTAR ANTRIAN ===");
        while (tmp != null) {
            System.out.println(tmp.noAntrian + " | " + tmp.data.namaPembeli + " | " + tmp.data.noHp);
            tmp = tmp.next;
        }
    }

    public NodePembeli07 hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }

        NodePembeli07 removed = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return removed;
    }
}