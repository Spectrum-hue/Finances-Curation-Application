package com.finance_curation_springboot.config;

//https://www.youtube.com/watch?v=hUi_WMZyasU&ab_channel=GagandeepSingh
//https://www.javatpoint.com/angular-spring-crud-example
//https://www.javainuse.com/spring/ang7-crud
//https://github.com/zsra/sas
//https://github.com/SelimHorri/project-tracking-system
//https://dzone.com/articles/integrating-spring-boot-and-react-with-spring-secu-1
import java.io.IOException;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

	private static final long serialVersionUID = -7858869558953243875L;

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException {

		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
	}
}

