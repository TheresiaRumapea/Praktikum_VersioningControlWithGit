import java.util.Scanner;
public class Tes {

       /**
        * @param args
        */
       public static void main(String[] args) {
              // TODO Auto-generated method stub
            
              String nama;
            
              Scanner input_program = new Scanner (System.in);
              System.out.print("Masukan Nama Anda: ");
              nama = input_program.nextLine();
              System.out.println("Nama Kamu : " + nama);
              System.out.println("Nama Dia : " + nama); 
              System.out.println("Nama Mereka : " + nama); 
       }

}