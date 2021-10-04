package pl.testuj;

public class WorkContact extends PhoneContact {

    public WorkContact(int id, String name, String surname, String number) {
        super(id, name, surname, number);
    }

    @Override
    public void print() {
        System.out.println("Kontakt " + ContactType.WORK.getFullType());
        super.print();
    }

    @Override
    public void send() {
        super.send();
    }
}
