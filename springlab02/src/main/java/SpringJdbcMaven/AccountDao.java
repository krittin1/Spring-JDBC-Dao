package SpringJdbcMaven;
import java.util.List;
public interface AccountDao {
    void insertAccount(Account account);
    Account getOneAccount(int id);
    List<Account> getAllAccounts();





//  … // also update and delete accounts

}
