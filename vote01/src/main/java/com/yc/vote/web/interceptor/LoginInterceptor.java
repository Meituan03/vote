package com.yc.vote.web.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
/**
 * 
 * �û���¼У��������
 * @author ling
 *
 */
//MethodFilterInterceptor���Զ����󷽷����й���
public class LoginInterceptor extends MethodFilterInterceptor {

	private static final long serialVersionUID = 1307687631270550421L;


	public String doInercept(ActionInvocation invocation) throws Exception {
		Map<String,Object> session=ActionContext.getContext().getSession();//ȡ��session�ķ�װ����
		Object obj=session.get("loginUser");
		if(obj==null){
			session.put("errorMsg", "���¼��,�ٽ��в���!!");
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
