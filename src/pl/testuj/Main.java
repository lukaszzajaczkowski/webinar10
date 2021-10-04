package pl.testuj;


/*


- wyświetlenie kontaktu
- wyślij jako wizytówka zaimplementować metodę send()

Wykorzystując polimorfizm stworzyć tablicę przechowującą kilka kontaktów różnego typu
i na każdym kontakcie wywołać metodę print()



 */

public class Main {

    public static void main(String[] args) {


        MobileContact mobileContact = new MobileContact(1, "Wojtek", "Nowak", "123456789");
        PrivateContact privateContact = new PrivateContact(2, "Maciek", "Kowalski", "1234567");
        WorkContact workContact = new WorkContact(3, "Michał", "Adamski", "23232232");


        System.out.println("===================");

        PhoneContact[] phoneContacts = new PhoneContact[3];

        phoneContacts[0] = mobileContact;
        phoneContacts[1] = privateContact;
        phoneContacts[2] = workContact;

        for (int i = 0; i < phoneContacts.length; i++) {
            phoneContacts[i].print();
        }


    }

}
