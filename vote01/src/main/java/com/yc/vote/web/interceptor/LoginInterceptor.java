package com.yc.vote.web.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
/**
 * 
 * 用户登录校验拦截器
 * @author ling
 *
 */
//MethodFilterInterceptor可以对请求方法进行过滤
public class LoginInterceptor extends MethodFilterInterceptor {

	private static final long serialVersionUID = 1307687631270550421L;


	public String doInercept(ActionInvocation invocation) throws Exception {
		Map<String,Object> session=ActionContext.getContext().getSession();//取到session的封装对象
		Object obj=session.get("loginUser");
		if(obj==null){
			session.put("errorMsg", "请登录后,再进行操作!!");
			return "login";
		}
		return invocation.invoke();
	}


	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
