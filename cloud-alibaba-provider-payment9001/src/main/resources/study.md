# 父pom内添加 spring-cloud-alibaba 依赖

```xml
    <!--spring cloud alibaba 2.1.0.RELEASE-->
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-alibaba-dependencies</artifactId>
    <version>2.1.0.RELEASE</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```

# 本module pom 内 添加 spring-cloud-starter-alibaba-nacos-discovery 依赖

```xml

<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
```

# 主启动类

1. 服务提供者使用 @EnableDiscoveryClient 注解开启服务注册与发现功能；
2. 服务消费者使用 @EnableDiscoveryClient 注解开启服务注册与发现功能；
3. @EnableFeignClients开启feign声明式调用

这里是服务提供者

```java
    @EnableDiscoveryClient
@SpringBootApplication
```

# controller

# 测试

启动主启动类 访问

```http request
http://localhost:9001/payment/nacos/1
```

#### 插曲

在引入 spring-cloud-starter-alibaba-nacos-discovery 依赖时，不小心在官网上黏贴了 spring-cloud-starter-alibaba-nacos-config
启动9001一波错误袭来，疯狂百度，修改application为bootstrap，又是yml内配置内容的修改，在这个过程中，将discovery修改成了config且yml为bootstrap
这是服务启动没有错误出现了，但是nacos服务列表里始终没有该服务。 一番学习，知晓在项目中使用spring-cloud-starter-alibaba-nacos-config来实现应用的外部化配置
https://blog.csdn.net/nan1996jiang/article/details/112218970