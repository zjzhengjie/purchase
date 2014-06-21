package com.wantdo.interceptor;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.dao.DataAccessException;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.wantdo.exception.SystemException;

/**
 * 

* @ClassName: ExceptionInterceptor 

* @Description: �쳣������

* @author sa luanx@wantdo.com

* @date 2014-4-22 ����11:31:29 

*
 */

public class ExceptionInterceptor extends AbstractInterceptor {
	
	private final Log logger=LogFactory.getLog(getClass());

	@Override
	public String intercept(ActionInvocation invoke) throws Exception {
		// TODO Auto-generated method stub
		logger.info("exception interceptor");
		String result="";
		try {
			result=invoke.invoke();
		}catch (DataAccessException e) {
			// TODO: handle exception
			throw new SystemException("���ݿ����ʧ�ܣ�");
		}catch (NullPointerException e) {
			// TODO: handle exception
			throw new SystemException("��ָ�룬������δ����ʼ�����ǲ����ڵĶ���");
		}catch (IOException e) {
			// TODO: handle exception
			throw new SystemException("IO��д�쳣��");
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			throw new SystemException("ָ�����಻���ڣ�");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			throw new SystemException("��ѧ�����쳣��");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			throw new SystemException("�����±�Խ�磡");
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
			throw new SystemException("���÷����Ĳ�������");
		}catch (ClassCastException e) {
			// TODO: handle exception
			throw new SystemException("����ǿ��ת������");
		}catch (SecurityException e) {
			// TODO: handle exception
			throw new SystemException("Υ����ȫԭ���쳣��");
		}catch (SQLException e) {
			// TODO: handle exception
			throw new SystemException("�������ݿ��쳣��");
		}catch (NoSuchMethodException e) {
			// TODO: handle exception
			throw new SystemException("������δ����ķ�����");
		}catch (InternalError e) {
			// TODO: handle exception
			throw new SystemException("Java������������ڲ�����");
		}catch (Exception e) {
			// TODO: handle exception
			throw new SystemException("�����ڲ����󣬲���ʧ�ܣ�");
		}
		return result;
	}

}
