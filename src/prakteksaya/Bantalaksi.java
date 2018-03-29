package prakteksaya;

public class Bantalaksi {
    public static void main(String[] args) {
        
        Bantal r1= new Bantal ();
        r1.panjang = 11;
        r1.lebar = 8;
        
        r1.cetakInfo();
        System.out.println("Luas Bantal ="+r1.hitungluas());
        r1.cetakLuas();
    
        Bantal r2= new Bantal();
        r2.cetakInfo();
                
        Bantal r3= new Bantal();
        r3.cetakInfo();
    }

    
}
