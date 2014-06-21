package com.wantdo.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.wantdo.domain.Person;
import com.wantdo.service.IPersonService;

/**
 * 

* @ClassName: LoginAction 

* @Description: µÇÂ½Action

* @author sa luanx@wantdo.com

* @date 2014-4-16 ÏÂÎç5:59:45 

*
 */

public class LoginAction extends ActionSupport{
	
	private final Log logger=LogFactory.getLog(getClass());
	
	private IPersonService personService;
	private Person person;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		logger.info("Person [username="+person.getUsername()+
				",password="+person.getPassword()+"]");
		if (personService.checkLogin(person)) {
			return SUCCESS;
		}else {
			return ERROR;
		}
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public IPersonService getPersonService() {
		return personService;
	}

	public void setPersonService(IPersonService personService) {
		this.personService = personService;
	}

	

}
