package io.project.springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.project.springboot.Model.Cliente;
import io.project.springboot.Repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

//	@Autowired
//	public void setRepository(ClienteRepository clienteRepository) {
//		this.clienteRepository = clienteRepository;
//	}

//	public ClienteService(ClienteRepository clienteRepository) {
//		this.clienteRepository = clienteRepository;
//	}

	public void salvarCliente(Cliente cliente) {
		validacaoCliente(cliente);
		clienteRepository.salvar(cliente);
	}

	public void validacaoCliente(Cliente cliente) {
		// aplicacao
	}
}
