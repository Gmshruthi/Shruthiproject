public class Reverse {
    public static void main(String args[]){
        String p="JAVA";
        String rev="";
        for(int i=p.length()-1;i>=0;i--)
        {
            rev=rev+p.charAt(i);

        }
        System.out.println(rev);
    }
}
