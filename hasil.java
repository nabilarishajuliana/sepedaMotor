
package sepedaMotor;


public class hasil {

    public static void main(String[] args) {
        // TODO code application logic here
        sepedaMotor test = new sepedaMotor();
        motor1 vario=new motor1();
        vario.setnama("Vario");
        vario.setkategori("Matic");
        vario.perawatan(1000000);         //overload
        vario.perawatan(1000000, 500000); //overload
        test.cetak();                     //override
        vario.cetak();                    //override
        
        motor1 scoopy=new motor1();
        scoopy.setnama("scoopy");
        scoopy.setkategori("Matic");
        scoopy.perawatan(1300000);         //overload
        scoopy.perawatan(1300000, 100000); //overload
        System.out.println("=========================");
        test.cetak();                     //override
        scoopy.cetak();                    //override
    }
    
}
