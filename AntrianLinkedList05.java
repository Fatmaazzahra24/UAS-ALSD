public class AntrianLinkedList05 {
    nodeKendaraan05 head; 
    nodeKendaraan05 tail;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    } 

    public void tambahAntrian(kendaraan05 data) {
        nodeKendaraan05 input = new nodeKendaraan05(data);
        if (isEmpty()) {
            head = tail = input;
        } else {
            tail.next = input;
            tail = input;
        }
        size++;
        System.out.println("Kendaraan dengan plat nomor " + data.platNomor + " telah ditambahkan ke antrian.");
    }

    public kendaraan05 layaniAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada kendaraan yang bisa dilayani.");
            return null;
        }
        kendaraan05 data = head.data;
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        nodeKendaraan05 current = head;
        int no = 1;
        System.out.println("Daftar Kendaraan dalam Antrian:");
        while (current != null) {
            System.out.println("Antrian ke-" + no++);
            System.out.println("Plat Nomor: " + current.data.platNomor);
            System.out.println("Jenis     : " + current.data.tipe);
            System.out.println("Pemilik   : " + current.data.merk);
            System.out.println();
            current = current.next;
        }
    }

    public int jumlahAntrian() {
        return size;
    }
}
