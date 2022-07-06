public class ReverseANumber {
    public static int reverse(int number) {
        // code here
        String sAnswer="";
        if(number<0) {
            number*=-1;
            sAnswer+="-";
        }
        String sNum=number+"";
        for (int i=sNum.length()-1;i>=0;i--)
            sAnswer+=sNum.charAt(i);
        return Integer.parseInt(sAnswer);
    }
}
