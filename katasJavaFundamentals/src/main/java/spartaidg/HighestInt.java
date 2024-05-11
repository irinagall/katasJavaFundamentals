package spartaidg;

public class HighestInt {

    public int highestNumber(int[] intsArr){

     int currHighestNumber = intsArr[0];

     for(int i = 0; i<intsArr.length; i++){
        if(currHighestNumber<intsArr[i]){
        currHighestNumber = intsArr[i];
        }
     }
     return currHighestNumber;
    }

}
