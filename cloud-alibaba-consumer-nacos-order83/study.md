# 该模块为消费者，会使用到之前定义的 cloud-api-commons 模块，依赖引入

```xml

<dependency>
    <groupId>com.muchmeat.springcloud</groupId>
    <artifactId>cloud-api-commons</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

# yml文件内配置消费者将要去访问的微服务名称

```yaml
service-url:
  nacos-user-service: http://nacos-payment-provider
```

# 配置类

### 定义配置类ApplicationContextConfig.java，莫忘记添加 @Configuration 注解

### 使用 @LoadBalanced 注解表明负载均衡

# 主启动类

1. 服务提供者使用 @EnableDiscoveryClient 注解开启服务注册与发现功能；
2. 服务消费者使用 @EnableDiscoveryClient 注解开启服务注册与发现功能；
3. @EnableFeignClients开启feign声明式调用

这里是服务消费者

```java
    @EnableDiscoveryClient
@SpringBootApplication
```

# 测试

在Nacos与payment9001服务均成功启动且服务成功注册进Nacos的前提下， 启动主启动类，访问

```http request
http://localhost:83/consumer/payment/nacos/12
```

# Nacos与其他注册中心特性对比

# Nacos 和 CAP (一致性协议)

Nacos支持CP或者AP
