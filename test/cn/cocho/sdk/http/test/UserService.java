package cn.cocho.sdk.http.test;

import cn.cocho.sdk.http.attributes.SdkInterface;
import cn.cocho.sdk.http.attributes.SdkMethod;
import cn.cocho.sdk.http.attributes.SdkParam;

/**
 * Created by shk on 14-7-19.
 */
@SdkInterface
public interface UserService {

    @SdkMethod("/anonymous/uc/loginUserWithAccreditCode.do")
    public JsonResult<UserInfo> login(@SdkParam("corpCode") String corpCode, @SdkParam("username") String username, @SdkParam("password") String password);

}
