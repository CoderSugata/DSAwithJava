public class BinarytoDecimal {
    
    public static void BintoDec(int binNum){
        int myNum=binNum;
        int power=0;
        int decNum=0;

        while (binNum>0) {
            int lastDig=binNum%10;
            decNum=decNum+(lastDig*(int)Math.pow(2, power));
            power++;
            binNum /=10;
        }
        System.out.println("decimal of "+myNum+" = "+decNum);
    }
    public static void main(String[] args) {
        BintoDec(1111);
    }
}
