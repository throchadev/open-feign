package br.com.throchadev.openfeign.client;

import br.com.throchadev.openfeign.response.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viaCep", url = "http://viacep.com.br/ws/")
public interface EnderecoClient {

  @GetMapping("/{cep}/json")
  Endereco getEndereco(@PathVariable("cep") String cep);
}
