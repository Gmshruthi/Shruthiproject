public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public  void setName(String name) {
        if(name!=null && !name.trim().isEmpty()){
            this.name=name;
        }
        else{
            System.out.println("name cannot be null or empty");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<150){
            this.age=age;
        }
        else {
            System.out.println("age must be between 0 and 150.");
        }

    }

}
