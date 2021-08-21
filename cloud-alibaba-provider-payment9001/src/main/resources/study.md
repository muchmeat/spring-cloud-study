#父pom内添加 spring-cloud-alibaba 依赖
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

#本module pom 内 添加 spring-cloud-starter-alibaba-nacos-discovery 依赖
```xml
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
        </dependency>
```
#主启动类
启用Nacos发现服务
```java
    @EnableDiscoveryClient
    @SpringBootApplication
```

#controller

#测试
启动主启动类
访问
```http request
http://localhost:9001/payment/nacos/1
```