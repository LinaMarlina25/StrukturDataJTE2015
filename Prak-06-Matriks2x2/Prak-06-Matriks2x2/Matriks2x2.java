
/**
 * Write a description of class Matriks2x2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Matriks2x2
{
    public Matriks2x2(){
        int a11, a12, a21, a22;
}
Scanner scan;
int elemen [][];
int kolom, baris;

void create(){
    scan = new Scanner(System.in);
    System.out.println("masukkan jumlah baris :");
    baris = Integer.parseInt(scan.nextLine());
    
    System.out.println("masukkan jumlah kolom :");
    kolom = Integer.parseInt(scan.nextLine());
matrix = new int[row][column];
		System.out.println("masukkan matriks :");
 
		for(int i=0; i<baris; i++) {
			
			for(int j=0; j<kolom; j++) {
				
				matrix[i][j] = scan.nextInt();
			}
		}
	}
	
	void display() {
		
		System.out.println("Matriksnya :");
		
		for(int i=0; i<baris; i++) {
			
			for(int j=0; j<kolom; j++) {
				
				System.out.print("\t" + matrix[i][j]);
			}
			System.out.println();
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		Matrix_Create obj = new Matrix_Create();
		
		obj.create();
		obj.display();
	}

}

