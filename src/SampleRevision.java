import java.util.zip.ZipFile;

public class SampleRevision {

    public int addition(int num1,int num2){

        return num1+num2;

    }
    public boolean isPrime(int number){
        boolean response= true;
        for (int i = 0; i < number; i++) {
            if(number %i==0) {
                response = false;
                break;
            }
        }
        return  response;
    }
}
