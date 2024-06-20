public class OverLoadingMethods {
    public static void main(String[] args) {
        System.out.println(sum2(2,3));
        System.out.println(sum2(2,3,2));
    }
        public static int sum2 (int x,int y){
            return x + y;
}
    public static int sum2 (int x,int y,int z){
        return x + y + z;
}
}
