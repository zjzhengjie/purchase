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

* @Description: 空格过滤拦截器

* @author sa luanx@wantdo.com

* @date 2014-4-16 下午4:27:03 

*
 */

public class TrimInterceptor extends AbstractInterceptor {
	
	private final Log logger=LogFactory.getLog(getClass());

	/**
	 * @Description:拦截所有参数，去掉参数空格
	 */
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		logger.info("filter interceptor");
		Map<String, Object> map=invocation.getInvocationContext().getParameters();
		//遍历Map，并去掉空格
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
	* @Description: 遍历参数数组里面的数据，取出空格
	* @param @param params
	* @param @return    设定文件 
	* @return Object    返回类型 
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
