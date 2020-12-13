package con.laulee;

import com.laulee.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by laulee on 2020/12/13.
 */
public class Test {

	@org.junit.Test
	public void test(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Person person = applicationContext.getBean(Person.class);
		System.out.println(person);
	}
}
