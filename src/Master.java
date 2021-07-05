public class Master {
    public static void main(String[] args) {
        System.out.println("Master");

        int a = 0x10000000;
        int b = 0x20000000;
        int c = 0x04000000;
        int d = 0x08000000;

        int e = 0;

        e |= a;
//        e |= b;
        e |= c;

        if ((e&a) == a){
            System.out.println("a ");
        }
        if ((e&b) == b){
            System.out.println("b ");
        }
        if ((e&c) == c){
            System.out.println("c ");
        }
        if ((e&d) == d){
            System.out.println("d ");
        }
//        Child child = new Child();
//        child.eat(-1);
//        System.out.println("-----------------");
//        child.eat(1);
    }
}
