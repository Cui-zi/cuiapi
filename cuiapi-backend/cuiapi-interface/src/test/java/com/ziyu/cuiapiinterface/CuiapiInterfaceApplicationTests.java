package com.ziyu.cuiapiinterface;

import com.ziyu.cuiapiclientsdk.client.CuiApiClient;
import com.ziyu.cuiapiclientsdk.model.User;
import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class CuiapiInterfaceApplicationTests {

    @Resource
    private CuiApiClient cuiApiClient;

    @Test
    void contextLoads() {
        String result = cuiApiClient.getNameByGet("ziyu");
        User user = new User();
        user.setUsername("cuiziyu");
        String usernameByPost = cuiApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
