服务发现 consul  

sc-learn-rest-server:提供rest接口  
  
sc-learn-rest-client:使用feign调用rest服务  
  
sc-learn-service-deregister:注销consul集群中不可用的微服务实例  
微服务优雅停机时能够自动注销consul中的当前实例```org.springframework.cloud.client.serviceregistry.AbstractAutoServiceRegistration.destroy```  
提供rest接口注销consul集群中所有不可用的微服务实例```com.luoluocaihong.springcloud.learn.servicederegister.service.ConsulServiceControl```  
自动注销微服务实例可以使用2种方式:实现DisposableBean接口或者使用@PreDestroy注解  
前者参考```com.luoluocaihong.springcloud.learn.servicederegister.config.AutoDeregisterConfig```  
后者参考consul客户端的实现方式即```org.springframework.cloud.client.serviceregistry.AbstractAutoServiceRegistration.destroy```    