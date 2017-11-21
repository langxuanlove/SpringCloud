package org.sxm.demo.service;

import org.apache.struts2.StrutsSpringTestCase;
import org.junit.Test;
import org.sxm.demo.action.UserinfoAction;

import com.opensymphony.xwork2.ActionProxy;


public class ActionTest extends StrutsSpringTestCase {  

	private UserinfoAction action;  
    private ActionProxy proxy;  
  
    protected String[] getContextLocations() {
        return new String[] {"classpath:applicationContext.xml"};
    }
//    @Test
    private void init(){  
        proxy=getActionProxy("/user/userinfo!detail.action");  
        action=(UserinfoAction)proxy.getAction();  
    }  
    @Test
    public void testAdd() throws Exception{  
        init();  
        proxy.execute();  
        assertEquals(request.getAttribute("add.result"),3);  
    } 
}  