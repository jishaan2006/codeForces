import java.util.Scanner;

public class c101 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];

            int firstMinus = -1;
            int lastMinus = -1;

            int previousOne = -1;
            int firstOne = -1;
            int lastOne = -1;

            int bestLeft = -1;
            int bestRight = -1;
            int bestLength = 0;

            for (int i = 0; i <n; i++) {
                arr[i] = sc.nextInt();
                //saw -1
                if(arr[i]==-1){
                    if(firstMinus==-1){
                        firstMinus=i;
                    }
                    lastMinus=i;

                    if (bestLength == 0) {
                        bestLength = 1;
                        bestLeft = i;
                        bestRight = i;
                    }

                }
                //saw 1
                if(arr[i]==1){
                    if (bestLength == 0) {
                        bestLength = 1;
                        bestLeft = i;
                        bestRight = i;
                    }

                    if(firstOne==-1){
                        firstOne=i;
                    }
                    lastOne=i;

                    //Two consecutive 1s
                    if(previousOne!=-1){
                        int length=i-previousOne+1;
                        if(length>bestLength){
                            bestLength=length;
                            bestLeft=previousOne;
                            bestRight=i;
                        }
                    }
                    previousOne=i;
                }
            }

            // -1 before the first fixed 1
            if(firstOne!=-1 && firstMinus!=-1 && firstMinus<firstOne){
                int length=firstOne-firstMinus+1;
                if(length>bestLength){
                    bestLength=length;
                    bestLeft=firstMinus;
                    bestRight=firstOne;
                }
            }

            //-1 after the first fixed 1
            if (lastOne != -1 && lastMinus != -1 && lastMinus > lastOne) {
                int length = lastMinus - lastOne + 1;

                if (length > bestLength) {
                    bestLength = length;
                    bestLeft = lastOne;
                    bestRight = lastMinus;
                }
            }

            // No fixed 1s
            if(firstOne==-1 && firstMinus!=-1 && lastMinus!=firstMinus){
                int length =lastMinus-firstMinus+1;
                if(length>bestLength){
                    bestLength=length;
                    bestLeft=firstMinus;
                    bestRight=lastMinus;
                }
            }

            //set 0s
            for (int i = 0; i < n; i++) {
                if(arr[i]==-1){
                    arr[i]=0;
                }
            }

            //end point found so make them 1
            if(bestLeft!=-1){
                arr[bestLeft]=1;
                arr[bestRight]=1;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
