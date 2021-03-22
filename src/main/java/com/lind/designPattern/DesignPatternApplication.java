package com.lind.designPattern;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixCommandProperties;
import com.netflix.hystrix.HystrixThreadPoolKey;
import com.netflix.hystrix.HystrixThreadPoolProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DesignPatternApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DesignPatternApplication.class, args);
    }

    @GetMapping("hello")
    public ResponseEntity hello() throws InterruptedException {
        HelloWorldCommand command = new HelloWorldCommand("hello");
        String result = command.execute();
        Thread.sleep(1000);
        return ResponseEntity.ok(result);
    }


    public class HelloWorldCommand extends HystrixCommand<String> {
        private final String name;

        public HelloWorldCommand(String name) {
            super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"))
                    .andCommandKey(HystrixCommandKey.Factory.asKey("query"))
                    .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("ExampleThreadPool"))
                    .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.Setter().withCoreSize(1))//服务线程池数量
                    .andCommandPropertiesDefaults(HystrixCommandProperties.Setter()
                            .withCircuitBreakerErrorThresholdPercentage(60) //熔断器关闭到打开阈值
                            .withCircuitBreakerSleepWindowInMilliseconds(3000)//熔断器打开到关闭的时间窗长度
                            .withCircuitBreakerEnabled(true)
                            .withExecutionTimeoutEnabled(true)
                            .withExecutionTimeoutInMilliseconds(10)
                    ));
            this.name = name;
        }


        @Override
        protected String run() {
            // 依赖逻辑封装在run()方法中
            return "Hello " + name + ", thread: " + Thread.currentThread().getName();
        }

        @Override
        protected String getFallback() {
            Throwable e = getExecutionException();
            if (e != null) {
                System.err.println("hystrix异常");
            }
            return "服务器繁忙，请稍后再试";
        }
    }
}
