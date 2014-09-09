package cn.cocho.sdk.http.test;

import cn.cocho.sdk.http.core.ServiceFactory;
import cn.cocho.sdk.http.utils.SdkContext;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HttpSdkTest {

    public HttpSdkTest() {
    }

    @Test
    public void init() {
        try {
            initContext();
            addRelation();
//            login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initContext() {
        SdkContext.showLog = true;
        SdkContext.serverBaseUrl = "http://192.168.1.102:8082/qiaobao-svc";
        SdkContext.log = new LoggerTools();
    }
    
    private void addRelation(){
    	try {
    		UserRelationInfo userRelationInfo = new UserRelationInfo();
    		userRelationInfo.setUserId("test");
    		userRelationInfo.setUserRelationId("11");
    		userRelationInfo.setRelationId("test");
    		userRelationInfo.setRelationType("PRINT");
    		
    		UserService userService = ServiceFactory.getService(UserService.class);
            JsonResult<UserRelationInfo> result = userService.insertUserRelationInfo(userRelationInfo, "916bb82b3b464ef1af82c37baba9f0a6");
            assertEquals(result != null, true);
            System.out.println(result.getStatusMsg());


        } catch (Exception e) {
            e.printStackTrace();
            assertEquals(true, false);
        }

    	
    }

    private void login() {
        try {
            UserService userService = ServiceFactory.getService(UserService.class);
            JsonResult<UserInfo> result = userService.login("keqiaokeji", "songhaikang", "111");
            assertEquals(result != null, true);
            System.out.println(result.getStatusMsg());
            UserInfo userInfo = result.getResultFirst();
            if(userInfo != null){
            	System.out.printf(userInfo.getUserId());
            }


        } catch (Exception e) {
            e.printStackTrace();
            assertEquals(true, false);
        }


    }


}
