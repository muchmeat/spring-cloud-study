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

![Nacos与其他注册中心特性对比](https://github.com/muchmeat/spring-cloud-study/blob/master/image/Nacos%E4%B8%8E%E5%85%B6%E4%BB%96%E6%B3%A8%E5%86%8C%E4%B8%AD%E5%BF%83%E5%AF%B9%E6%AF%94.png)

# Nacos 和 CAP

Nacos支持CP或者AP(场景切换)

# CAP理论

* C —— 一致性：在分布式系统完成某写操作后的任何读操作，都应该获取到该写操作写入
的那个最新的值。 相当于要求分布式系统中的各节点时时刻刻保持数据的一致性。
* A —— 可用性：一直可以正常的做读写操作。简单而言就是客户端一直可以正常访问并
得到系统的正常响应。用户角度来看就是不会出现系统操作失败或者访问超时等问题。
* P —— 分区容错性：指的分布式系统中的某个节点或者网络分区出现了故障的时候，
整个系统仍然能对外提供满足一致性和可用性的服务。也就是说部分故障不影响整体使用
