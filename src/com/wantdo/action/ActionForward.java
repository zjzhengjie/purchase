package com.wantdo.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 

* @ClassName: ActionForward 

* @Description: ��תAction

* @author sa luanx@wantdo.com

* @date 2014-4-16 ����5:49:51 

*
 */

public class ActionForward extends ActionSupport {
	
	private final Log logger=LogFactory.getLog(getClass());

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		logger.info("forward");
		return SUCCESS;
	}
	
	

}
