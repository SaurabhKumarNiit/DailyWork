public class twoDArray {
    public static void main(String[] args) {
        int[][] array = {{10,20,30,40,50},
                        {10,20,30,40,50},
                        {10,10,10,10,10},
                        {10,10,10,10,10},
                        {0,0,0,0,0}};
        int i,j;
        int sum=0;
        i=0;
        j=0;

        for (i = 0; i < array.length; i++) {
            for ( j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+", ");
                sum=sum+array[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of all elements :"+sum);
    }
}

