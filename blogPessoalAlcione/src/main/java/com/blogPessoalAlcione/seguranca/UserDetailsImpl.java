package com.blogPessoalAlcione.seguranca;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.blogPessoalAlcione.model.Usuario;

public class UserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = 1L;
	
	
	
	// atributos privados
	private String userName;
	private String password;
	
	// Construtor de casse - Pasametro User e popular com login e senha
	public UserDetailsImpl (Usuario user) {
		this.userName = user.getUsuario();
				this.password = user.getSenha();
				
	}
	// Contrutor vazio
	 public UserDetailsImpl() {}
	
	// Implementar os métodos de acordo com os Details
	
	 
	
	// Metodos da implementação - Ela avisa quando quer
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}