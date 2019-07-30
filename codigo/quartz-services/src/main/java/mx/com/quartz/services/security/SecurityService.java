package mx.com.quartz.services.security;



import mx.com.quartz.common.login.LoginRequest;
import mx.com.quartz.common.login.LoginResponse;
import mx.com.quartz.common.logout.LogoutRequest;
import mx.com.quartz.common.response.GeneralResponse;

import javax.servlet.http.HttpServletRequest;

/*
* Rafael Cortes  / Emmanuel Torres / Armando Jacobo
* Fecha: 21/12/18
* Desarrollado por SERTI 
*
*/

public interface SecurityService {
    public LoginResponse login(LoginRequest request, HttpServletRequest req);
    public GeneralResponse logout(LogoutRequest request, HttpServletRequest req);

	
}
