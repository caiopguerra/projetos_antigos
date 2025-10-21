package br.com.api.g5.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.g5.domain.Usuario;
import br.com.api.g5.dto.UsuarioDTO;
import br.com.api.g5.services.EmailService;
import br.com.api.g5.services.UsuarioService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@Autowired
	EmailService emailService;

	@GetMapping("/listarUsuarios")
	@SecurityRequirement(name = "Bearer Auth")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<List<Usuario>> listarUsuarios() {
		return ResponseEntity.ok(usuarioService.listarUsuario());
	}

	@GetMapping("/{usuarioId}/buscarUsuario")
	@SecurityRequirement(name = "Bearer Auth")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Usuario> buscarUsuarioPorId(@PathVariable Long usuarioId) {
		return ResponseEntity.ok(usuarioService.buscarUsuarioPorId(usuarioId));
	}

	@PostMapping("/salvarUsuario")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Usuario> salvarUsuario(@Valid @RequestParam String email, @RequestBody UsuarioDTO usuarioDTO) throws MessagingException
			{
		emailService.confirmacaoCadastroUsuario(email, usuarioDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.salvarUsuario(usuarioDTO));
	}

	@DeleteMapping("/{usuarioId}/excluirUsuario")
	@SecurityRequirement(name = "Bearer Auth")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Void> excluirUsuario(@Valid @PathVariable Long usuarioId) {
		usuarioService.excluirUsuario(usuarioId);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/{usuarioId}/atualizarUsuario")
	@SecurityRequirement(name = "Bearer Auth")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Usuario> atualizarUsuario(@Valid @PathVariable Long usuarioId, UsuarioDTO usuarioDTOAtualizado) {
		return ResponseEntity.ok(usuarioService.atualizarUsuario(usuarioId, usuarioDTOAtualizado));
	}
}
