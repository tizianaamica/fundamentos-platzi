package fundamentos.example.fundamentos.platzi;

import fundamentos.example.fundamentos.platzi.bean.MyBean;
import fundamentos.example.fundamentos.platzi.bean.MyBeanWithDependency;
import fundamentos.example.fundamentos.platzi.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosPlatziApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;


	public FundamentosPlatziApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
										MyBean myBean, MyBeanWithDependency myBeanWithDependency){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosPlatziApplication.class, args);
	}

	@Override
	public void run(String... args) {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependecy();
	}
}
