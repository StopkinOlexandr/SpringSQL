package lesson5.spring;

import lesson5.EventDAO;
import lesson5.UserDAO;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

  @Bean
  public DataSource dataSource() {
    PGSimpleDataSource pgDataSource = new PGSimpleDataSource();
    pgDataSource.setServerName("localhost");
    pgDataSource.setDatabaseName("testDB");
    pgDataSource.setUser("postgres");
    pgDataSource.setPassword("1111");
    return pgDataSource;
  }

  @Bean
  public UserDAO userDAO() {
    return new UserDAO(dataSource());
  }

  @Bean
  public EventDAO eventDAO() {
    return new EventDAO(dataSource());
  }
}