package Git.src.practise;

public class Pass {
    public static void main(String[] args) {
        int number=1;
        for (int i=1; i<=50; i++) {
            if(i%5==0){
                System.out.println("Pass");
                number++;
            }else{
                System.out.println(number);
                number++;
            }
        }
    }
}
