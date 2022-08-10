
    import java.util.Arrays;

    public class SortingDemo1 {
        public boolean bubbleSort(int[] arrayToBeSorted) {
            boolean sorted=true;
            for (int i = 0; i < arrayToBeSorted.length; i++) {
                if (arrayToBeSorted[i] > arrayToBeSorted[i+1]){
             sorted=false;
             break;
                }
                }
                for (int j = 0; j < arrayToBeSorted.length - 1; j++) {
                    if(arrayToBeSorted[j] > arrayToBeSorted[j+1]){
                        int temp = arrayToBeSorted[j];
                        arrayToBeSorted[j] = arrayToBeSorted[j+1];
                        arrayToBeSorted[j+1] = temp;

                    }
                }


            return sorted;
        }

        public static void main(String[] args) {
            int[] arr = {50,40,10,5,2,1};
            SortingDemo1 object = new SortingDemo1();
            System.out.println(object.bubbleSort(arr));

            }
        }



