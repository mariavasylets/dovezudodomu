public class Taxi  extends Person{
    private int priceECONOMY;
    private int priceCOMFORT;
    private int priceBUSINESS;
    private int dooplatu;

    public Taxi(String name, int yearOFbirth, double balanceONtheCARD, int promocode, int priceECONOMY, int priceCOMFORT, int priceBUSINESS){
        super(name, yearOFbirth, balanceONtheCARD, promocode);
        this.priceECONOMY=priceECONOMY;
        this.priceCOMFORT=priceCOMFORT;
        this.priceBUSINESS=priceBUSINESS;
    }

    void cost(int routTIME,String clas) {
        switch (clas) {
            case "економ":
                dooplatu = routTIME * priceECONOMY - routTIME * priceECONOMY * discount() / 100;
                break;
            case "комфорт":
                dooplatu = routTIME * priceCOMFORT - routTIME * priceCOMFORT * discount() / 100;
                break;
            case "бізнес":
                dooplatu = routTIME * priceBUSINESS - routTIME * priceBUSINESS * discount() / 100;
                break;
        }
        System.out.println("Вартість Таксі = " + dooplatu + " грн");
    }

    void cost(){
        System.out.println("Введіть потрібну інформацію для замовлення: час поїздки, клас таксі");
    }
    void cost(int routTIME){
        System.out.println("Введіть потрібну інформацію для замовлення: час поїздки, клас таксі");
    }
    void cost(String clas){
        System.out.println("Введіть потрібну інформацію для замовлення: час поїздки, клас таксі");
    }

    void oplata (){

        if(age()>=16 & balanceONtheCARD>dooplatu){
            balanceONtheCARD=balanceONtheCARD-dooplatu;
            if(dooplatu>1000){
                System.out.println("Oплата пройшла, баланс на карті = "+balanceONtheCARD+" грн. Ваш промокод для наступного замовлення - 2800");
            }else{
                System.out.println("Oплата пройшла, баланс на карті = "+balanceONtheCARD+" грн. Ваш промокод для наступного замовлення - 2031");
            }
        }else{
            System.out.println("У вас недостатньо коштів або ви не досягли потрібного віку для користування послугами, баланс на карті = "+balanceONtheCARD+" грн");
        }
    }
}

