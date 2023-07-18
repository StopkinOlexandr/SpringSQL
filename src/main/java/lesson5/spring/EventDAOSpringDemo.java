package lesson5.spring;

import java.sql.SQLException;
import lesson5.Event;
import lesson5.EventDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventDAOSpringDemo {
  public static void main(String[] args) throws SQLException {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    EventDAO eventDAO = context.getBean(EventDAO.class);
    for (int i = 1; i < 4; i++) {
      Event event = eventDAO.findById(i);
      System.out.println(event);
    }
  }
}
