package Latihan3;

public class ListTest {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList list = new StrukturList();

        // 2. Tambah elemen 3 di akhir list
        Node node1 = new Node(3);
        list.addTail(node1);

        // 3. Tambah elemen 4 di akhir list
        Node node2 = new Node(4);
        list.addTail(node2);

        // 4. Tambah elemen 5 di akhir list
        Node node3 = new Node(5);
        list.addTail(node3);

        // 5. Tampilkan elemen list
        list.displayElement(); // Memanggil metode displayElement langsung dari objek list
    }
}
