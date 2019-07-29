package br.com.algamoney.api.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeradorDeSenha {

	public static void main(String[] args) {

		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		System.out.println(bcrypt.encode("123456"));
	}

}
