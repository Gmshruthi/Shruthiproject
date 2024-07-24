public class Main1 {
        public static void main(String[] args) {

            Person person = new Person("John Doe", 30);
            System.out.println("Initial name: " + person.getName());
            System.out.println("Initial age: " + person.getAge());
            person.setName("Jane Smith");
            person.setAge(25);

            System.out.println("Updated name: " + person.getName());
            System.out.println("Updated age: " + person.getAge());

            person.setName("");
            person.setAge(200);
            System.out.println("Name after invalid change: " + person.getName());
            System.out.println("Age after invalid change: " + person.getAge());
        }
    }

