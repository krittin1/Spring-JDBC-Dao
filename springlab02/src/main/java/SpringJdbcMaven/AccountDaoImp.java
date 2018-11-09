package SpringJdbcMaven;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AccountDaoImp implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public AccountDaoImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public void insertAccount(Account account) {
        String query = "insert into account (accountNumber, accountName) values (?, ?);";
        Object[] data = new Object[]
                {account.getAccountNumber(), account.getAccountName() };
        jdbcTemplate.update(query, data);
    }


    public Account getOneAccount(int id) {

        String query = "select * from account where accountNumber = "
                + id;

        Account account = jdbcTemplate.queryForObject(query,
                new RowMapper<Account>() {
                    public Account mapRow(ResultSet rs, int rowNum)
                            throws SQLException {
                        Account account = new Account(
                                rs.getInt("accountNumber"),
                                rs.getString("accountName"));
                        return account;
                    }
                });

        return account;
    }


    public List<Account> getAllAccounts() {

        String query = "select * from account";

        List<Account> accounts = jdbcTemplate.query(query,
                new RowMapper<Account>() {
                    public Account mapRow(ResultSet rs, int rowNum)
                            throws SQLException {
                        Account account = new Account(
                                rs.getInt("accountNumber"),
                                rs.getString("accountName"));
                        return account;
                    }
                });
        return accounts;
    }
}

