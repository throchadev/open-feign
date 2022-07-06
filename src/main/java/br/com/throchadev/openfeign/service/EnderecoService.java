package br.com.throchadev.openfeign.service;

import br.com.throchadev.openfeign.client.EnderecoClient;
import br.com.throchadev.openfeign.response.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {

  @Autowired
  private EnderecoClient enderecoClient;

  public Endereco getEndereco(String cep) {
    return enderecoClient.getEndereco(cep);
  }
}
