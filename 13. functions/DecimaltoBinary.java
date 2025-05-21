public class DecimaltoBinary {
    
        public static void DectoBin(int decNum){
            int myNum=decNum;
            int power=0;
            int binNum=0;
    
            while (decNum>0) {
                int rem=decNum%2;
                binNum=binNum+(rem*(int)Math.pow(10, power));
                power++;
                decNum=decNum/2;
            }
            System.out.println("binary of "+myNum+" = "+binNum);
        }
        public static void main(String[] args) {
            DectoBin(5);
        }   
}
