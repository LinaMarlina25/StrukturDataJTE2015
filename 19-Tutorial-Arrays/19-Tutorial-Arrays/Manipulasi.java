import java.util.Arrays;

public class Manipulasi {
    public static void main(String[] args) {
        int[] data = {9, 8, 7, 6, 5, 6, 7, 8, 9};
        System.out.print("Sebelum: ");
        for (int satu : data) {
            System.out.print(satu);
            System.out.print(" ");
        }
        System.out.println();
        
        Arrays.sort(data);

        System.out.print("Sesudah: ");
        for (int satu : data) {
            System.out.print(satu);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println();
        
        int indeks = Arrays.binarySearch(data, 8);
        // Belum tentu ditemukan yang pertama (i.e. bisa yang ke-3)
        // Kan Binary search
        System.out.print("Nilai 8 terdapat pada elemen ke-");
        System.out.println(indeks);
        System.out.println();
    }
}
