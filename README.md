Spring Cloud的版本命名是以伦敦地铁站的名字来命名的）
Spring Cloud 微服务架构学习笔记与示例
https://www.cnblogs.com/edisonchou/p/java_spring_cloud_foundation_sample_list.html


Spring Cloud Netflix：核心组件，可以对多个Netflix OSS开源套件进行整合，包括以下几个组件：服务发现（Eureka），断路器（Hystrix），智能路由（Zuul），客户端负载均衡（Ribbon）等。

    Eureka：服务治理组件，包含服务注册与发现
    Hystrix：容错管理组件，实现了熔断器,过载保护
    Ribbon：客户端负载均衡的服务调用组件
    Feign：基于Ribbon和Hystrix的声明式服务调用组件
    Zuul：网关组件，提供智能路由、访问过滤等功能
    Archaius：外部化配置组件

***************************************************************************************************************************************************************************************************
服务注册和发现的工具:
Eureka (AP)|Consul支持NET CORE|Steeltoe 来和Spring Cloud进行兼容 ，让Java和.Net Core微服务能够共存
Zookeeper(CP)

负载均衡：
应用场景：ribbon本地负载均衡适合微服务rpc远程调用，比如：dubbo，springcloud
nginx服务负载均衡适合于针对服务器端，比如：tomcat、jetty

---------------------------------------------------
1.idea打包
    file->project structure->
2.idea启动多个服务
    右上角 edit configurtion->添加多个启动配置，启动参数：1.--spring.profiles.active=peer1；2.1.--spring.profiles.active=peer2；3.1.--spring.profiles.active=peer3
3. idea注释：ctrl+/
   



代码参考文章
https://blog.csdn.net/forezp/article/details/81040946