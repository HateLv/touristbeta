import lombok.Data;

@Data


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"    );


        Person p = new Person(12,"Erik", "","123","asd","","","","");
    Person pp = new Person(13,"name", "email");


        System.out.println(p);
        System.out.println(pp);

  p.setName("Erik");



    }
}
