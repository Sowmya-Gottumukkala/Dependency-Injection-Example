package Day11.SpringExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	
    public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
  Vehicle vehicle = (Vehicle) context.getBean("vehicle");

         
        System.out.println("Vehicle Name: " + vehicle.getVname());
        System.out.println("Engine Model: " + vehicle.getEngine().getModel());
        System.out.println("Engine Capacity: " + vehicle.getEngine().getCapacity());
    }
}
