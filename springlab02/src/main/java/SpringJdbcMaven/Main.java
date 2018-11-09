package SpringJdbcMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jca.context.ResourceAdapterApplicationContext;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        AccountDao accountDao = context.getBean("accountDaoImp", AccountDao.class);

        accountDao.insertAccount(new Account(6, "Meya"));

        Account act = accountDao.getOneAccount(6);
        System.out.println("---getOne: "+act);

        List<Account> accountList = accountDao.getAllAccounts();
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

}

