package Git.src.practise.Generics;

public class GenericClassPair<T,V> {
    T key;
    V value;
    public GenericClassPair(T key,V value){
        this.key=key;
        this.value=value;
    }
    @Override
    public String toString() {
        return "key:"+key+" value:"+value;
    }
    public static void main(String[] args) {
        GenericClassPair<String,Integer> genericClassPair1=new GenericClassPair<>("one",1);
        System.out.println(genericClassPair1);
        GenericClassPair<Integer,String> genericClassPair2=new GenericClassPair<>(2,"two");
        System.out.println(genericClassPair2);
    }
}
