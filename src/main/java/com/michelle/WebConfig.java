package com.michelle;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.List;
import java.util.Map;

/**
 * Created by changqi.wu on 2018/1/18.
 */

@Configuration
@ConfigurationProperties(prefix = "")
@Data
public class WebConfig {
//        @Value("relation_type")
    private Map<String, List<String>> relation_type;
    private Map<String, String> relationtest;
}