服务发现 consul  

sc-learn-rest-server:提供rest接口  
  
sc-learn-rest-client:使用feign调用rest服务  
  
sc-learn-service-deregister:注销consul集群中不可用的微服务实例      
提供rest接口注销consul集群中所有不可用的微服务实例```com.luoluocaihong.springcloud.learn.servicederegister.service.ConsulServiceControl```  
支持微服务停机时自动注销当前微服务实例```com.luoluocaihong.springcloud.learn.servicederegister.config.AutoDeregisterConfig```  