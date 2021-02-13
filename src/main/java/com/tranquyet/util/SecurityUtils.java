package com.tranquyet.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import com.tranquyet.dto.MyUser;

public class SecurityUtils {

	public static MyUser getPrincipal() {
		MyUser myUser = (MyUser) (SecurityContextHolder.getContext().getAuthentication().getPrincipal());
		return myUser;
	}

	public static List<String> getAuthorities() {
		List<String> results = new ArrayList<>();
		@SuppressWarnings("unchecked")
		List<GrantedAuthority> authority = (List<GrantedAuthority>) (SecurityContextHolder.getContext()
				.getAuthentication().getAuthorities());
		authority.stream().forEach(p -> {
			results.add(p.getAuthority());
		});
		return results;
	}

}
