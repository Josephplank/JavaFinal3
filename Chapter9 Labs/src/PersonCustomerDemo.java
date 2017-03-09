
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonCustomerDemo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<Customer>();

        for(int i = 0; true; i++)
        {
            String name, address, telephone, number;
            boolean onMailingList;

            System.out.println("Customer #" + (i +1)  + "\n" +
                               "------------");
            System.out.println("Name: ");
            name = scanner.nextLine();

            System.out.println("Address: ");
            address = scanner.nextLine();

            System.out.println("Telephone: ");
            telephone = scanner.nextLine();

            System.out.println("Customer number: ");
            number = scanner.nextLine();

            System.out.println("On mailing list (true or false): ");
            onMailingList = scanner.nextBoolean();

            customers.add(new Customer(name, address, telephone, number, onMailingList));

            System.out.println("Add another customer (true or false): ");

            if(!scanner.nextBoolean())
            {
                break;
            }

            System.out.println();
        }

        for(Customer customer : customers)
        {
            System.out.println("\nCustomer Number " + customer.getNumber() + "\n" +
                               "----------------------\n" +
                               "Name: " + customer.getName() + "\n" +
                               "Address: " + customer.getAddress() + "\n" +
                               "Telephone: " + customer.getTelephone() + "\n" +
                               "On mailing list: " + customer.isOnMailingList());
        }
    }
}
