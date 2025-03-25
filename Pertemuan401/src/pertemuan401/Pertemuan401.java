package pertemuan401;

import java.util.Scanner;

/**
 *
 * @author Made Artha
 * TGL 25 Maret 2025
 */
public class Pertemuan401 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] nama = new String[5];
        
        for(int y=0;y<5;y++){
            System.out.print("isi Data Teman: ");
            nama[y] = inp.nextLine();
        }
        
        for(int i=0;i<nama.length;i++){
            System.out.println("Data ke-"+(i+1)+": "+nama[i] );
        }
        
        for(String x : nama){
            System.out.println(x);
        }
        
    }
    
}
