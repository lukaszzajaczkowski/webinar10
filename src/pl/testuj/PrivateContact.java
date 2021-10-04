package pl.testuj;

public class PrivateContact extends PhoneContact {

    public PrivateContact(int id, String name, String surname, String number) {
        super(id, name, surname, number);
    }

    @Override
    public void print() {
        System.out.println("Kontakt " + ContactType.PRIV.getFullType());
        super.print();
    }

    @Override
    public void send() {
        super.send();
    }
}
