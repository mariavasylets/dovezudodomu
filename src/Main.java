public class Main {
    public static void main(String[] args) {
        Person client1 = new Person("Марія", 2006, 5000, 20);
        Taxi first = new Taxi( "Марія",2006, 5000, 20,3, 5, 7 );
        Delivery one = new Delivery("Марія", 2006, 4850, 2031, 150);
        System.out.println(client1.name+client1.reg());
        first.cost(30, "комфорт");
        first.oplata();
        one.costt("Tytti", "Цезар та лимонад", 250);
        one.oplataD();
    }
}