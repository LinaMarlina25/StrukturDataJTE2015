import java.util.ArrayList;
import java.util.Date;
import java.math.BigInteger;
import java.lang.String;

private class DaftarTransaksi {
    
    public DaftarTransaksi() {
       daftar = new ArrayList<
    }
    
    public void tambah(Transaksi baru) {
        daftar.add(baru);
    }
    
    public int banyakTransaksi() {
        return daftar.size();
    }
    
    public BigInteger saldoAkhir() {
        return saldoAkhir;
    }
    
    public String saldoAkhirStr(){
     
         return saldoAkhir.toString();
         
        }
    public void tampilkan() {
        System.out.print("saldo: ");
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