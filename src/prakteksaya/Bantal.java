package prakteksaya;
public class Bantal {
    double panjang;
    double lebar;
    
    void cetakInfo(){
          System.out.println("Panjang       :"+lebar);
          System.out.println("Panjang       :"+panjang); 
    }
    
    double hitungluas (){
        double luas;
        luas=panjang*lebar;
        return luas;
        
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah: "+hitungLuas());
    }
}
