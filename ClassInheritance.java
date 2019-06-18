class User {
  String name;

  User(String name) {
    this.name = name;
  }

  void sayHi() {
    System.out.println("hi! " + this.name);
  }
}

class AdminUser extends User {

  AdminUser(String name) {
    super(name);
  }

  void sayHello() {
    System.out.println("hello! " + this.name);
  }

  // override
  @Override
  void sayHi() {
    System.out.println("[admin] hi! " + this.name);
  }
}

public class ClassInheritance {

  public static void main(String[] args) {
    User tom = new User("tom");
    System.out.println(tom.name); // => tom
    tom.sayHi(); // => hi! tom

    AdminUser bob = new AdminUser("bob");
    System.out.println(bob.name); // => bob
    bob.sayHi(); // => [admin] hi! bob
    bob.sayHello(); // => hello! bob
  }

}