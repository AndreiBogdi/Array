public class Lab5 {
    public static void main(String[] args){
        //Define and write the values of an array indices,
      //  so that the values of the arrays should start from 1 and count to 100;
        LogicalOperations op = new LogicalOperations();
     //   int[] myArr = op.populateArray(68);

       // op.printArray(myArr);


        int[] array3 = op.populateArray(50);
        System.out.println(op.getAveragValueFromArray(array3));
        System.out.println(op.isValueInArray(array3, 47));
        }


}
