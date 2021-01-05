public class goodPairs {

    static void numOfGoodPairs(int [] numArr){
        int numPairs = 0;
                for(int i = 0;i<numArr.length;i++){
                    for(int j=0;j<numArr.length;j++){
                        if(i<j && numArr[i]==numArr[j]){
                                numPairs++;

                        }
                    }
                }
                System.out.println(numPairs);
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,1,1,3};
        numOfGoodPairs(arr);
    }

}
