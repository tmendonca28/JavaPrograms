public class PersonPolymorphismExample{
        void walk(){
            System.out.println("Can run");
        }
    }
    class Teenager extends PersonPolymorphismExample{
        void walk() {
            System.out.println("Runs faster");
        }

        public static void main(String[] args) {
            PersonPolymorphismExample p = new Teenager();
            p.walk();
        }
}

