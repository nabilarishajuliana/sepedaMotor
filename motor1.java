
package sepedaMotor;

public class motor1 extends sepedaMotor{
    
    private String nama,kategori; //atribut
    int total,total2;
     
    
    void setkategori(String kat){  //setter
        this.kategori=kat;
    }
    
    String getkategori (){  //getter
       return kategori; 
    }
    
    public void setnama(String name){ //setter
       this.nama=name;
        
    }
    public String getnama(){  //getter
        return nama;
    }
    
    String ciriCiri(){  //override
       super.ciri="tidak menggunakan kopling,warna putih";
        return ciri;
    }
    
    void perawatan(int biaya){ //overload
        total=biaya;
    }
    void perawatan(int biaya,int ekstra){ //overload
        total2=biaya+ekstra;
    }
    
    void cetak(){  //override
        System.out.println("merk motor \t\t\t="+getnama());
         System.out.println("kategori \t\t\t="+getkategori());
        System.out.println("ciri ciri spesifik \t\t="+ciriCiri());
        System.out.println("biaya perawatan \t\t\t=Rp"+total);
        System.out.println("jika ingin perawatan ekstra \t=Rp"+total2);
        
        
    }
}
