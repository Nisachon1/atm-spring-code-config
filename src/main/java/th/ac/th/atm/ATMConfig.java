package th.ac.th.atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class ATMConfig {
    @Bean
    public DataSource dataSource() {
        return new DataSourceFile();
    }
    @Bean
    public Bank bank(){
        return new Bank("MY Bank",dataSource());
    }
    @Bean
    public ATM atm(){
        return new ATM(bank());
    }
    }
