package br.com.throchadev.openfeign;

import br.com.throchadev.openfeign.response.Endereco;
import br.com.throchadev.openfeign.service.EnderecoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@Log4j2
public class OpenFeignApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignApplication.class, args);
	}

	@Autowired
	private EnderecoService enderecoService;

	@Override
	public void run(String... args) throws Exception {

		log.info("Open Feign");
		var cep = "17560-246";
		log.info("Pesquisando o CEP {} ...", cep);
		Endereco endereco = enderecoService.getEndereco(cep);
		log.info("Endereco encontrado: " + endereco);

	}
}
