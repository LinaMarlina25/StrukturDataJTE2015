import java.util.ArrayList;

public class ArrayListInteger {
    public ArrayListInteger() {
        data = new ArrayList<Integer>();
    }
    
    public void tambah(Integer baru) {
        data.add(baru);
    }
    
    public int panjang() {
        return data.size();
    }
    
    public void tampilkan() {
        System.out.print("Panjang: ");
        System.out.println(data.size());
        
        for (int cnt = 0; cnt < data.size(); ++cnt) 
            System.out.println(data.get(cnt).toString());
        System.out.println();
    }
    
    private ArrayList<Integer> data;
    
    public static void main(String[] args) {
        ArrayListInteger contoh = new ArrayListInteger();
        contoh.tampilkan();
        contoh.tambah(3);
        contoh.tampilkan();
        contoh.tambah(2);
        contoh.tampilkan();
        contoh.tambah(1);
        contoh.tampilkan();
        contoh.tambah(4);
        contoh.tampilkan();
    }
}