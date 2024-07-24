public class Array {
    public static void main(String args[]) {
        String[] names = {"shruthi", "akshaya", "sadhana"};
        System.out.println("using for loop");
        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]);

        }
        System.out.println("using while loop");
        int i = 0;
        while (i < names.length) {

            System.out.println(names[i]);
            i++;
        }
        System.out.println("using do while loop");
        i = 0;
        do {
            System.out.println(names[i]);
            i++;

        }
        while (i < names.length);
        //for each
        for(String n : names){
            System.out.println(n);

        }
    }
}
