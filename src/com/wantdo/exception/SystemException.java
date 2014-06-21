package com.wantdo.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 

* @ClassName: SystemException 

* @Description: �쳣������

* @author sa luanx@wantdo.com

* @date 2014-4-22 ����1:46:18 

*
 */

public class SystemException extends RuntimeException {

	public SystemException() {
        super();
    }
		
	public SystemException(String message) {
		super(createErrMsg(message));
	}
	
	public SystemException(Throwable cause) {
        super(cause);
    }
	
	public SystemException(String message, Throwable cause) {
        super(createErrMsg(message), cause);
    }
	
	public static String createErrMsg(String msgBody){
		StringBuffer errMsg=new StringBuffer();
		String prefixStr="��Ǹ��";
		String suffixStr="���Ժ����Ի������Ա��ϵ��";
		errMsg.append(prefixStr).append(msgBody).append(suffixStr);
		System.out.println(errMsg.toString());
		return errMsg.toString();
	}

}
