
package sepedaMotor;

public class sepedaMotor {
    String ciri;
   
    String ciriCiri (){ //override
        ciri="dapat berjalan,mengeluarkan sisa bahan bakar,beroda 2";
        return ciri;
    }
    
    void cetak (){  //override
        System.out.println("//SEPEDA MOTOR//");
        System.out.println("ciri ciri umum \t\t\t="+ciriCiri());

    }
}
