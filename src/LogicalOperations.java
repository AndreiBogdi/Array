public class LogicalOperations {


        public int[] populateArray ( int max){
            int[] myArr =new int[max];
            for (int i = 0; i < max; i++) {
                myArr[i] = i + 1;
            }
            return myArr;
        }

        public void printArray ( int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);

            }
        }
        public float getAveragValueFromArray ( int[] array){

            float sum = 0;
            for (int i = 0; i < array.length; i++) {

                sum = sum + array[i];
            }
            return (sum / array.length);

        }

        public boolean isValueInArray(int[] array, int value){
            for(int i=0;i<array.length;i++){
                if(array[i] == value){
                    return true;
                }else
                    return false;
            }
            return false;
        }

}
