package com.ziyu.cuiapiclientsdk;

import com.ziyu.cuiapiclientsdk.client.CuiApiClient;
import com.ziyu.cuiapiclientsdk.model.User;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("cuiapi.client")
@Data
@ComponentScan
public class CuiApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public CuiApiClient cuiApiClient() {
        return new CuiApiClient(accessKey, secretKey);
    }

}
