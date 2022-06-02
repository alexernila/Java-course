public class Main {
    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new deskPhone(17625789);
        myPhone.powerOn();
        myPhone.callPhone(17625789);
        myPhone.answer();

        myPhone = new MobilePhone(17625789);
        myPhone.powerOn();
        myPhone.callPhone(17625789);
        myPhone.answer();
    }
}
