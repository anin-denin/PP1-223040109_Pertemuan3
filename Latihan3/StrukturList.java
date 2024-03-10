package Latihan3;

public class StrukturList {
    private Node HEAD;

    // Konstruktor untuk inisialisasi
    public StrukturList() {
        this.HEAD = null;
    }

    // Fungsi untuk menambahkan node baru di akhir/tail list
    public void addTail(Node data) {
        if (HEAD == null) {
            HEAD = data;
        } else {
            Node current = HEAD;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(data);
        }
    }

    // Getter untuk mengembalikan HEAD aktual
    public Node getHEAD() {
        return HEAD;
    }


    public void displayElement() {
        Node current = HEAD;
        while (current != null) {
            System.out.println(current.getData() + " ");
            current = current.getNext();
        }
    }


}


