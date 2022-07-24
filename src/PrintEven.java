import java.util.Locale;

public class PrintEven {
    public static void print(int i){
        if(i%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
    public static void printE(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.toLowerCase().charAt(i)=='e')
                count++;
            System.out.println(count);
        }
    }
    public static void addCount(int[] array, char c){
        switch (c) {
            case 'a':
                array[0]++;
                break;
            case 'b':
                array[1]++;
                break;
            case 'c':
                array[2]++;
                break;

            case 'd':
                array[3]++;
                break;
            case 'e':
                array[4]++;
                break;
            case 'f':
                array[5]++;
                break;

        }
        int[] array2={5,4,6,1,7,3,7,6,9};
        for (int i=0;i< array2.length/2; i++){
            int j= array2.length-1-i;
            int temp=array2[j];
            array2[j]=array2[i];
            array2[i]=temp;
        }
        boolean isSorted=false;
        while(!isSorted){
            isSorted=true;
            for(int i=0;i<array2.length-1;i++)
            {
                if(array2[i]>array2[i+1]){
                    isSorted=false;
                    int temp=array2[i+1];
                    array2[i+1]=array2[i];
                    array2[i]=temp;
                }
            }
        }

    }
}
