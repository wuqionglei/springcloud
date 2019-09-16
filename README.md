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
    spring cloud config:在Spring Cloud中，有分布式配置中心组件spring cloud config ，它支持配置服务放在配置服务的内存中（即本地），也支持放在远程Git仓库中。在spring cloud config 组件中，分两个角色，
                        一是config server，二是config client。
   
    spring cloud bus：Spring Cloud Bus 将分布式的节点用轻量的消息代理连接起来。它可以用于广播配置文件的更改或者服务之间的通讯，也可以用于监控。本文要讲述的是用Spring Cloud Bus实现通知微服务架构的配置文件的更改。
                         rabbitmq:先安装erlang，后安装rabbitmq，安装rabbitmq后启动sbin插件。
                        （我的目录是：D:\Program Files\RabbitMQ Server\rabbitmq_server-3.7.3\sbin ，然后在后面输入rabbitmq-plugins enable rabbitmq_management命令进行安装）
                        http://localhost:15672/  
                        默认用户名和密码都是guest


***************************************************************************************************************************************************************************************************
服务注册和发现的工具:
Eureka (AP)|Consul支持NET CORE|Steeltoe 来和Spring Cloud进行兼容 ，让Java和.Net Core微服务能够共存
Zookeeper(CP)

负载均衡：
应用场景：ribbon本地负载均衡适合微服务rpc远程调用，比如：dubbo，springcloud
nginx服务负载均衡适合于针对服务器端，比如：tomcat、jetty


Eureka：服务治理组件，包含服务注册与发现
    server:
        http://localhost:8761
    client:
        http://localhost:8762/hi?name=forezp
        http://localhost:8763/hi?name=forezp    

Ribbon：客户端负载均衡的服务调用组件
    http://localhost:8764/hi?name=forezp

Feign：基于Ribbon和Hystrix的声明式服务调用组件
    http://localhost:8765/hi?name=forezp   

Zuul：网关组件，提供智能路由、访问过滤等功能
    http://localhost:8769/api-a/hi?name=forezp&token=22    

spring cloud config
    config server：
        http://localhost:8888/foo/dev    
    config client：
        http://localhost:8881/hi

spring cloud bus:
    localhost:8881/actuator/bus-refresh

---------------------------------------------------
1.idea打包
    file->project structure->
2.idea启动多个服务
    右上角 edit configurtion->添加多个启动配置，启动参数：1.--spring.profiles.active=peer1；2.1.--spring.profiles.active=peer2；3.1.--spring.profiles.active=peer3
3. idea注释：ctrl+/
4.idea格式化：Ctrl+Alt+L   
5.目录全部展开:-> 目录全部收起:<-
6.代码全部收缩或者展开:ctrl+shift+"+"
7.System.out.println() :输入sout