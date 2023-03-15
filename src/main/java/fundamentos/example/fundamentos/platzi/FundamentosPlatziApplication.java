package fundamentos.example.fundamentos.platzi;

import fundamentos.example.fundamentos.platzi.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosPlatziApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;

	public FundamentosPlatziApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency){
		this.componentDependency = componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosPlatziApplication.class, args);
	}

	@Override
	public void run(String... args) {
		componentDependency.saludar();
	}
}
