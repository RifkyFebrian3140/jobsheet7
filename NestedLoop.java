public class NestedLoop {
    public static void main(String[] args) {
        for(int i = 0; i < 10; ++i){
            for(int s = 9; s > i; s--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
