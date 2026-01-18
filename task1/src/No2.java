public class No2 {
    public static void main(String[] args){
        int num = 876;
        int reverse = 0;
        while(num !=0){
            int dight = num %10;
            reverse =reverse*10+dight;
            num=num/10;
        }
        System.out.println(reverse);
    }

}
