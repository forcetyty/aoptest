package kr.co.itcen.aoptest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Container안에 Bean 설정
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		
		ProductService ps = ac.getBean(ProductService.class);
		//ps.hello();
		ProductVo vo = ps.find("TV");
		System.out.println(vo);
		
		((ConfigurableApplicationContext)ac).close();
		
	}

}
