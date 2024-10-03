package Git.src.practise.Generics;

class Box<u> {
    u bookName;
    public void setValue(u bookName) {
        this.bookName = bookName;
    }
    public u getValue() {
        return bookName;
    }
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.setValue("Fire");
        Box<Integer> box2 =new Box<Integer>();
        box2.setValue(2);
        System.out.println(box2.getValue());
        System.out.println(box.getValue());
    }
}
