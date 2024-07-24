public class Calc {
    public int a,b;
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public int sub(int a,int b){
        int sub=a-b;
        return sub;
    }
    public int mul(int a,int b){
        int mul=a*b;
        return mul;
    }
    public int div(int a,int b){
        int div=a/b;
        return div;
    }
    public static void main(String args[]){
        Calc c=new Calc();
        System.out.println("SUM: "+(c.add(12,56)));
        System.out.println("MUL: "+(c.mul(12,56)));
        System.out.println("DIV: "+(c.div(12,56)));
        System.out.println("SUB: "+(c.sub(12,56)));

    }

}
