package br.com.api.g5.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.api.g5.domain.Endereco;
import br.com.api.g5.domain.Usuario;
import br.com.api.g5.dto.UsuarioDTO;
import br.com.api.g5.repositories.EnderecoRepository;
import br.com.api.g5.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	EnderecoRepository enderecoRepository;


	public List<Usuario> listarUsuario() {
		return usuarioRepository.findAll();
	}

	public Usuario buscarUsuarioPorId(Long id) {
		return usuarioRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Usuário não encontrado!"));
	}

	public Usuario salvarUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		Endereco endereco = new Endereco();
		usuario.setNome(usuarioDTO.getNome());
		usuario.setTelefone(usuarioDTO.getTelefone());
		usuario.setEmail(usuarioDTO.getEmail());
		usuario.setCpf(usuarioDTO.getCpf());
		usuario.setComprador(usuarioDTO.getComprador());
		usuario.setVendedor(usuarioDTO.getVendedor());
		usuario.setDataNascimento(usuarioDTO.getDataNascimento());
		
		endereco.setCep(usuarioDTO.getCep());
		endereco.setComplemento(usuarioDTO.getComplemento());

		RestTemplate restTemplate = new RestTemplate();
		String uri = "https://viacep.com.br/ws/{cep}/json";
		Map<String, String> params = new HashMap<>();
		params.put("cep", usuarioDTO.getCep());

		Endereco enderecoCadastro = restTemplate.getForObject(uri, Endereco.class, params);
		enderecoRepository.save(enderecoCadastro);

		return usuarioRepository.save(usuario);
	}

	public void excluirUsuario(Long usuarioId) {
		usuarioRepository.deleteById(usuarioId);
	}

	public Usuario atualizarUsuario(Long usuarioId, UsuarioDTO usuarioDTOAtualizado) {
		usuarioRepository.findById(usuarioId);
		Usuario usuario = new Usuario();
		Endereco endereco = new Endereco();
		usuario.setUsuarioId(usuarioId);
		usuario.setNome(usuarioDTOAtualizado.getNome());
		usuario.setTelefone(usuarioDTOAtualizado.getTelefone());
		usuario.setEmail(usuarioDTOAtualizado.getEmail());
		usuario.setCpf(usuarioDTOAtualizado.getCpf());
		usuario.setComprador(usuarioDTOAtualizado.getComprador());
		usuario.setVendedor(usuarioDTOAtualizado.getVendedor());
		usuario.setDataNascimento(usuarioDTOAtualizado.getDataNascimento());

		endereco.setCep(usuarioDTOAtualizado.getCep());
		endereco.setComplemento(usuarioDTOAtualizado.getComplemento());

		RestTemplate restTemplate = new RestTemplate();
		String uri = "https://viacep.com.br/ws/{cep}/json"; // %7Bcep%7D
		Map<String, String> params = new HashMap<>();
		params.put("cep", usuarioDTOAtualizado.getCep());

		Endereco enderecoCadastro = restTemplate.getForObject(uri, Endereco.class, params);
		enderecoRepository.save(enderecoCadastro);

		return usuarioRepository.save(usuario);
	}
}
