package com.sooncode.api;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 
 * 解决网络访问跨域问题，配合在web.xml文件中使用
 *
 */

public class CrosFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		 
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse crosResponse = (HttpServletResponse) response;
		crosResponse.setHeader("Access-Control-Allow-Origin", "*");
		crosResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE，PUT");
		crosResponse.setHeader("Access-Control-Max-Age", "3600");
		crosResponse.setHeader("Access-Control-Allow-Headers", "DNT,X-Mx-ReqToken,Keep-Alive,User-Agent,X-Requested-With,If-Modified-Since,Cache-Control,accept,Content-Type");
		crosResponse.setHeader("Access-Control-Allow-Credentials", "true");
		chain.doFilter(request, crosResponse);
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
