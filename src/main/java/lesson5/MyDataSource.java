package lesson5;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class MyDataSource {
  private static DataSource dataSource;

  public static DataSource getDataSource() {
    if (dataSource == null) {
      // настройка соединения с базой данных
      PGSimpleDataSource pgDataSource = new PGSimpleDataSource();
      pgDataSource.setServerName("localhost");
      pgDataSource.setDatabaseName("testDB");
      pgDataSource.setUser("postgres");
      pgDataSource.setPassword("1111");
      dataSource = pgDataSource;
    }
    return dataSource;
  }
}