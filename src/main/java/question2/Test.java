package question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("List.xml");
		Question q=(Question)context.getBean("question");
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		System.out.println(q.getAnswers());
		System.out.println(q.getAnswers1());
		System.out.println(q.getAnswers2());


	}

}
