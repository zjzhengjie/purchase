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

* @Description: 异常拦截器

* @author sa luanx@wantdo.com

* @date 2014-4-22 上午11:31:29 

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
			throw new SystemException("数据库操作失败！");
		}catch (NullPointerException e) {
			// TODO: handle exception
			throw new SystemException("空指针，调用了未经初始化或是不存在的对象！");
		}catch (IOException e) {
			// TODO: handle exception
			throw new SystemException("IO读写异常！");
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			throw new SystemException("指定的类不存在！");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			throw new SystemException("数学运算异常！");
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			throw new SystemException("数组下表越界！");
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
			throw new SystemException("调用方法的参数错误！");
		}catch (ClassCastException e) {
			// TODO: handle exception
			throw new SystemException("类型强制转换错误！");
		}catch (SecurityException e) {
			// TODO: handle exception
			throw new SystemException("违背安全原则异常！");
		}catch (SQLException e) {
			// TODO: handle exception
			throw new SystemException("操作数据库异常！");
		}catch (NoSuchMethodException e) {
			// TODO: handle exception
			throw new SystemException("调用了未定义的方法！");
		}catch (InternalError e) {
			// TODO: handle exception
			throw new SystemException("Java虚拟机发生了内部错误！");
		}catch (Exception e) {
			// TODO: handle exception
			throw new SystemException("程序内部错误，操作失败！");
		}
		return result;
	}

}
