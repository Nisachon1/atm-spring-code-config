package th.ac.th.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ATMConfig.class);

        ATM atm = context.getBean(ATM.class);

        String name = atm.validateCustomer(3,45678);
        System.out.println(name+"has"+atm.getBalance());
        atm.withdraw(300);
        System.out.println(name +"has"+ atm.getBalance());
    }
}
