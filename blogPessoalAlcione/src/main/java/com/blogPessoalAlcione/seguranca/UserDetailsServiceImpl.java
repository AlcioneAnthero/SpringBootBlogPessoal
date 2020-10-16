package com.blogPessoalAlcione.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.blogPessoalAlcione.model.Usuario;
import com.blogPessoalAlcione.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired  // Repositório 
	private UsuarioRepository userRepository;
	
	// Metodos 
	
	@Override 
	public UserDetails loadUserByUsername (String userName) throws UsernameNotFoundException {
		Optional<Usuario>user = userRepository.findByUsuario(userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + "not found."));
		
		return user.map(UserDetailsImpl :: new).get();
		
		
	}
}
