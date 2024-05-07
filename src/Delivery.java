public class Delivery extends Person{
    private int price;
    private int opl;

    public Delivery(String name, int yearOFbirth, double balanceONtheCARD, int promocode, int price){
        super(name, yearOFbirth, balanceONtheCARD, promocode);
        this.price=price;
    }

    void costt(String nameOFrest, String dish, int dishPRICE){
        opl = (dishPRICE + price)-(dishPRICE + price)*discount()/100;
        System.out.println("Назва ресторану = " + nameOFrest + ", Замовлення = " + dish + ", Ціна замовлення + доставка = " + opl+" грн");
    }
    void costt(String nameOFrest, String dish){
        System.out.println("Введіть потрібну інформацію для замовлення: Назва ресторану, замовлення в ресторані та його ціну");
    }
    void costt(String nameOFrest){
        System.out.println("Введіть потрібну інформацію для замовлення: Назва ресторану, замовлення в ресторані та його ціну");
    }
    void costt(int dishPRICE){
        System.out.println("Введіть потрібну інформацію для замовлення: Назва ресторану, замовлення в ресторані та його ціну");
    }
    void costt(){
        System.out.println("Введіть потрібну інформацію для замовлення: Назва ресторану, замовлення в ресторані та його ціну");
    }
    void costt(String nameOFrest, int dishPRICE){
        System.out.println("Введіть потрібну інформацію для замовлення: Назва ресторану, замовлення в ресторані та його ціну");
    }

    void oplataD (){
        if(age()>=16 & balanceONtheCARD>opl){
            balanceONtheCARD=balanceONtheCARD-opl;
            System.out.println("Оплата пройшла, баланс на карті = "+balanceONtheCARD+" грн. Ваш промокод для наступного замовлення - 2031");
        }else{
            System.out.println("У вас недостатньо коштів або ви не досягли потрібного віку для користування послугами, баланс на карті = "+balanceONtheCARD+" грн, радимо обрати економ клас або обрати іншу карту");
        }
    }

}
