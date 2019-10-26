import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args){
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.h2.Drivel.class);
        dataSource.setUsername("sa");
        dataSource.setUrl("");
        dataSource.setPassword("");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        System.out.println("Creating tables");
        jdbcTemplate.execute("drop table customers if exists ");
        jdbcTemplate.execute("create table customers(" + "id serial, first_name varchar(255),last_name varchar(255))");

        String[] names ="John Woo;Jeff Dean;Josh Blosh; Josh Long".split(";");
            for(String fullnames : names){
                String[] name = fullnames.split(" ");
                System.out.println("Inserting customer record for %s %s\n", name[0],name[1]);
                jdbcTemplate.update("INSERT INTO customers(first_name,last_name) values (?,?)", name[0],name[1]);
                }

        System.out.println("Querying for customer records where first_name = 'John':");
            List<Customer> results = jdbcTemplate.query("select * from customers where first_name = ?", new Object[]{"John"},
                    new RowMapper<Customer>() {
                    @Override
                        public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return new Customer(rs.getLong("id"),rs.getString("first_name"),rs.getString("last_name"));
                        }
                    });

            for(Customer customer : results) {
                System.out.println(customer );
            }
    }
}
