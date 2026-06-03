package Pratikum14;

public class BinaryTreeArray07 {
    Mahasiswa07[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray07() {
        dataMahasiswa = new Mahasiswa07[10];
    }

    void populateData(Mahasiswa07[] dataMhs, int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {

            if (dataMahasiswa[idxStart] != null) {

                traverseInOrder(2 * idxStart + 1);

                dataMahasiswa[idxStart].tampilInformasi();

                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}