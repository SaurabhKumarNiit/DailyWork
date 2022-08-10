import java.util.Random;

public class StringPrintName {
    public static void main(String[] args){
        String name="VaiBhav";
        for (int i = 0; i <name.length(); i++) {
            if(i%2==0){
                System.out.print((char)(name.charAt(i)-32            ));
            }
            else{
                System.out.print(name.charAt(i));
            }



        }
        System.out.println("here");
        System.out.println((long)(Math.random()*1000000*1000000));
        System.out.println("other");
        Random obj=new Random();
        for (int i = 0; i <12 ; i++) {
            System.out.print(obj.nextLong(10));

        }
    }
}
