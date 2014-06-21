package com.wantdo.interceptor;

import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 

* @ClassName: TrimInterceptor 

* @Description: �ո����������

* @author sa luanx@wantdo.com

* @date 2014-4-16 ����4:27:03 

*
 */

public class TrimInterceptor extends AbstractInterceptor {
	
	private final Log logger=LogFactory.getLog(getClass());

	/**
	 * @Description:�������в�����ȥ�������ո�
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		logger.info("filter interceptor");
		Map<String, Object> map=invocation.getInvocationContext().getParameters();
		//����Map����ȥ���ո�
		for(Entry<String, Object> entry:map.entrySet()){
			String key=entry.getKey();
			Object value=entry.getValue();
			map.put(key.trim(), transfer((String[])value));
		}
		return invocation.invoke();
	}

	/**
	 * 
	* @Title: transfer 
	* @Description: ��������������������ݣ�ȡ���ո�
	* @param @param params
	* @param @return    �趨�ļ� 
	* @return Object    �������� 
	* @throws
	 */
	private Object transfer(String[] params) {
		// TODO Auto-generated method stub
		for(int i=0;i<params.length;++i){
			if (StringUtils.isEmpty(params[i])) {
				continue;
			}
			params[i]=params[i].trim();
		}
		return params;
	}

}
