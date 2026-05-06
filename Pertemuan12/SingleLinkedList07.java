package Pertemuan12;

public class SingleLinkedList07 {
    NodeMahasiswa07 head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa07 temp = head;
            System.out.println("Isi Linked List:");
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void addFirst(Mahasiswa07 input) {
        NodeMahasiswa07 nd = new NodeMahasiswa07(input, null);
        if (isEmpty()) {
            head = tail = nd;
        } else {
            nd.next = head;
            head = nd;
        }
    }

    public void addLast(Mahasiswa07 input) {
        NodeMahasiswa07 nd = new NodeMahasiswa07(input, null);
        if (isEmpty()) {
            head = tail = nd;
        } else {
            tail.next = nd;
            tail = nd;
        }
    }

    public void insertAfter(String key, Mahasiswa07 input) {
        NodeMahasiswa07 temp = head;
        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                NodeMahasiswa07 nd = new NodeMahasiswa07(input, temp.next);
                temp.next = nd;
                if (nd.next == null) tail = nd;
                break;
            }
            temp = temp.next;
        }
    }

    public void insertAt(int index, Mahasiswa07 input) {
        if (index == 0) {
            addFirst(input);
            return;
        }

        NodeMahasiswa07 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        NodeMahasiswa07 nd = new NodeMahasiswa07(input, temp.next);
        temp.next = nd;

        if (nd.next == null) tail = nd;
    }

    // 🔥 TAMBAHAN METHOD
    public void getData(int index) {
        NodeMahasiswa07 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        NodeMahasiswa07 temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void removeFirst() {
        if (isEmpty()) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) return;

        if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa07 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }

        NodeMahasiswa07 temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        if (temp.next == null) tail = temp;
    }
}