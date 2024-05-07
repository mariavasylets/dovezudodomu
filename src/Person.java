public class Person {
    String name;
    double balanceONtheCARD;
    int yearOFbirth;
    int promocode;


    public Person(String name, int yearOFbirth, double balanceONtheCARD, int promocode){
        this.name=name;
        this.yearOFbirth=yearOFbirth;
        this.balanceONtheCARD=balanceONtheCARD;
        this.promocode=promocode;
    }

    int discount(){
        if (promocode==2031) return 3;
        if (promocode==2800) return 10;
        else return 0;
    }
    int age(){
        return 2024-yearOFbirth;
    }

    String reg(){
        if (age()>=16){
            return " pаді запропонувати наші послуги: таксі та доставка їжі. Користуйтесь нашими послугами та отримуйте промокоди на знижку для наступного замовлення. Ваша знижка на даний момент = "+discount();
        }else{
            return "Ви ще не маєте можливості користуватись нашими послугами ";
        }
    }
}
