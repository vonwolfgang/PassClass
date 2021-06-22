import java.util.Scanner;

public class PassClass {

    public static void main(String[] args){

        double mat, fiz, turk, kim, mus;
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Login your math note : ");
        mat = inp.nextDouble();
        if (mat>=0 && mat<=100) {
        }
        else{
            mat = 0;
        }
        System.out.println("Login your physics note : ");
        fiz = inp.nextDouble();
        if (fiz>=0 && fiz<=100) {
        }
        else{
            fiz = 0;
        }
        System.out.println("Login your turkish note : ");
        turk = inp.nextDouble();
        if (turk>=0 && turk<=100) {
        }
        else{
            turk = 0;
        }
        System.out.println("Login your chemistry note : ");
        kim = inp.nextDouble();
        if (kim>=0 && kim<=100) {
        }
        else{
            kim = 0;
        }
        System.out.println("Login your music note : ");
        mus = inp.nextDouble();
        if (mus>=0 && mus<=100) {
        }
        else{
            mus = 0;
        }

        double averNot = (mat+fiz+kim+turk+mus)/5;

        if (averNot>=55) {
            System.out.println("Yayy you passed");
            
        } else {
            System.out.println("Oh, no you failed");
        }

        
        

    }
}
