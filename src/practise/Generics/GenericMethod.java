package Git.src.practise.Generics;

public class GenericMethod {
    public <U> void array(U[] number) {
       for (U element : number){
           System.out.println(element);
       }
    }
    public static void main(String[] args) {
        GenericMethod genericMethod=new GenericMethod();
       Integer[] values={1,2};
       genericMethod.array(values);
    }
}
