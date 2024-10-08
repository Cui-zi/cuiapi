package com.ziyu.cuiapiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.ziyu.cuiapiclientsdk.model.User;



import java.util.HashMap;
import java.util.Map;

import static com.ziyu.cuiapiclientsdk.utils.SignUtils.getSign;


public class CuiApiClient {

    private static final String GATEWAY_HOST = "http://localhost:8091";

    private String accessKey;

    private String secretKey;

    public CuiApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name) {
        HashMap<String,Object> paramMap = new HashMap<>();
        paramMap.put("name",name);
        String result = HttpUtil.get(GATEWAY_HOST + "/api/name/",paramMap);
        System.out.println(result);
        return result;
    }

    public String getNameByPost(String name) {
        HashMap<String,Object> paramMap = new HashMap<>();
        paramMap.put("name",name);
        String result = HttpUtil.post(GATEWAY_HOST + "/api/name/",paramMap);
        System.out.println(result);
        return result;
    }

    private Map<String, String> getHeaderMap(String body) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("accessKey", accessKey);
        //hashMap.put("secretKey", secretKey);  一定不能直接发送
        hashMap.put("nonce", RandomUtil.randomNumbers(4));
        hashMap.put("body", body);
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        hashMap.put("sign", getSign(body, secretKey));
        return hashMap;
    }

    public String getUsernameByPost(User user) {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/name/user")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        System.out.println(httpResponse.getStatus());
        String result = httpResponse.body();
        System.out.println(result);
        return result;
    }
}
