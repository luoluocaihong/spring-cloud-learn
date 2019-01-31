//package com.luoluocaihong.springcloud.learn.rest.server.config;
//
//import com.ecwid.consul.v1.ConsulClient;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.cloud.consul.ConsulProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.util.StringUtils;
//
///**
// * Created by xh on 2019/1/30.
// */
//@Configuration
//public class MyConsulAutoConfiguration {
//
//    @Bean
//    public ConsulClient consulClient(ConsulProperties consulProperties) {
//        int agentPort = consulProperties.getPort();
//        String agentHost = "172.16.22.2";
//        if(consulProperties.getTls() != null) {
//            ConsulProperties.TLSConfig tls = consulProperties.getTls();
//            com.ecwid.consul.transport.TLSConfig tlsConfig = new com.ecwid.consul.transport.TLSConfig(tls.getKeyStoreInstanceType(), tls.getCertificatePath(), tls.getCertificatePassword(), tls.getKeyStorePath(), tls.getKeyStorePassword());
//            return new ConsulClient(agentHost, agentPort, tlsConfig);
//        } else {
//            return new ConsulClient(agentHost, agentPort);
//        }
//    }
//}
