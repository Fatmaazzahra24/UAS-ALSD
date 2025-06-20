public class queueTransaksi05 {
    TransaksiPengisian05[] transaksi;
    int front, rear, size, capacity;

    int totalPertamax = 0;
    int totalPertalite = 0;
    int totalSolar = 0;

    public queueTransaksi05(int capacity) {
        this.capacity = capacity;
        transaksi = new TransaksiPengisian05[capacity];
        front = size = 0;
        rear = -1;
    }

    public void enqueue(TransaksiPengisian05 item) {
        if (size == capacity) {
            System.out.println("Antrian Transaksi Penuh!");
            return;
        }
        rear = (rear + 1) % capacity;
        transaksi[rear] = item;
        size++;

        String jenis = item.bbm.namaBBM.toLowerCase();
        int liter = item.bbm.jumlahLiter;

        if (jenis.equals("pertamax")) {
            totalPertamax += liter;
        } else if (jenis.equals("pertalite")) {
            totalPertalite += liter;
        } else if (jenis.equals("solar")) {
            totalSolar += liter;
        } else {
            System.out.println("Jenis BBM tidak dikenal: " + jenis);
        }

    }

    public void tampilkanTransaksi() {
        if (size == 0) {
            System.out.println("Antrian Transaksi Kosong!");
            return;
        }

        System.out.println("Daftar Transaksi Pengisian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            transaksi[index].tampilkan();
        }
        System.out.println("\n===== Total BBM yang Dikeluarkan =====");
        System.out.println("Total Pertamax yang dikeluarkan : " + totalPertamax + " liter");
        System.out.println("Total Pertalite yang dikeluarkan: " + totalPertalite + " liter");
        System.out.println("Total Solar yang dikeluarkan    : " + totalSolar + " liter");
    }
}