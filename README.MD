#Spring Cloud Alibaba Naco方案微服务架构Demo

## 启动
1. 启动nacos添加配置 
Data ID:`api-gateway.yaml` 
Group:`XIAOWEI_MICROSERVICE_GROUP` 
    ```yaml
    zuul:
      routes:
        application1:
          stripPrefix: false
          path: /application1/**
    ```
2. 依次启动 
    ```java
    Service2Bootstrap.class 
    Service1Bootstrap.class 
    ApiGatewayBootstrap.class 
    ApplicationRun.class 
    ```
3. 访问`http://127.0.0.1:8000/application1/service` 
出现
`application-1|test|service1-server | Consumer Invoke | service2-server | Provider Invoke` 
运行正常 

## 架构 

+ Nacos 配置、注册中心
+ Feign 消费服务调用
+ Dubbo RPC远程服务调用
+ Zuul 网关

## 其他 
因为Spring Cloud 与Spring Boot 版本冲突问题总是存在。有时候可能会浪费大量时间调试maven、版本冲突关系。 
所以本项目为初学党制作一套规范，开箱就用。

***重要：*** 如果依赖有问题，请手动前往中央仓库下载依赖！！！！ ***【非常重要】*** 