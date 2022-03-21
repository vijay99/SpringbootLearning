package com.vijay.learn.SpringBootLearning.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Kumar Vijay
 */
@Component
@Endpoint(id="features")
public class FeatureEndpoints {
    private final Map<String,Feature> featureMap = new ConcurrentHashMap<>();


    public FeatureEndpoints(){
        featureMap.put("Department",new Feature(true));
        featureMap.put("University",new Feature(false));
        featureMap.put("Election",new Feature(true));
    }

    @ReadOperation
    public Map<String,Feature> features(){
        return featureMap;
    }

    @ReadOperation
    public Feature feature(@Selector String featureName){
        return featureMap.get(featureName);
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Feature{
        private boolean isEnabled;
    }

}
