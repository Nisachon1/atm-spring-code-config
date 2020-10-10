package th.ac.th.atm;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataSourceFile implements DataSource {
    public Map<Integer, Customer> readCustomers() {

        Map<Integer, Customer> customers = new HashMap<>();
        customers.put(1,new Customer(1,"Y",54265,10000));
        customers.put(2,new Customer(2,"P",25879,20000));
        customers.put(3,new Customer(3,"D",45678,30000));
        return customers;
    }
     }

