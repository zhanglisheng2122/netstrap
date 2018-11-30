# Netstrap

#### 项目介绍
简单实现 SpringBoot（李鬼） + Netty 的web框架, 学习Netty和SpringBoot 的第一选择，当然，若你想用于生产环境，请联系我。。 


#### 使用说明

1. 导入项目文件（多模块）
2. 打开netstrap-test
3. 打开DemoApplication
4. 运行Main函数

```
15:49:16.204 [main] INFO  io.netstrap.core.server.netty.NettyServer - The server bind IP:0.0.0.0 , PORT:9000
15:49:16.344 [main] INFO  io.netstrap.core.context.LogoApplicationListener - 
                                                                                
             ***  **                                                            
             ***  **          **             **                                 
             ***  **          **             **                                 
             **** **  ****  ******   ***** ******   * **    ****  *****         
             ******* **  **   **    **       **     ****   **  *  **  **        
             ** **** ******   **     ***     **     **      ***** **  **        
             ** **** **       **        **   **     **     **  ** **  **        
             **  *** **  **   **    **  **   **     **     ** *** **  **        
             **  ***  ****     ****  *****    ****  **     ****** *****         
                                                                  **            
                                                                  **
```

#### 调用方法

http://localhost:9000/hello       <br/>

```
15:50:32.525 [work-3-2] INFO  io.netstrap.test.filter.LogFilter - GET-/hello
15:50:32.526 [work-3-2] INFO  io.netstrap.test.filter.LogFilter - hello netstrap

```

#### 核心示例

1.Server启动示例

```
@NetstrapApplication
@Log4j2
public class DemoApplication {

    public static void main(String[] args) {
        NetstrapBootApplication.run(DemoApplication.class, args);
    }

}
```

2.Controller示例代码

```
@RestController
@Log4j2
public class HelloController {

    private final WechatConfig config;

    @Autowired
    public HelloController(WechatConfig config) {
        this.config = config;
    }

    /**
     * 打印字符串
     */
    @GetMapping("/hello")
    public void hello(HttpRequest request, HttpResponse response) {
        response.setBody(HttpBody.wrap("hello netstrap".getBytes()));
    }

}
```

3.Filter示例代码
```
@Filterable
@Log4j2
public class LogFilter implements WebFilter {

    @Override
    public boolean doBefore(HttpRequest request, HttpResponse response) throws Exception {
        log.info(request.getMethod().name()+"-"+request.getUri());
        return true;
    }

    @Override
    public boolean doAfter(HttpRequest request, HttpResponse response) throws Exception {
        log.info(new String(response.getBody().getBytes()));
        response.addHeader("Content-Type","application/json");
        return true;
    }

}

```

4.Config示例代码

```
@Configurable
@Prefix("wechat")
@Data
public class WechatConfig {

    private String accessKey;
    private String accessValue;
    private int    indexes;
    private String requestUri;

}

```

#### 压力测试（Jmeter4）

```
Qps(q/s):17765.931202223765
Error:0%
Samples:1022607
Min(ms):0
Max(ms):9263
Avg(ms):51
Sent(kb/s):3120kb/s
Received(kb/s):600kb/s
```

#### 打包部署

Test默认使用了SpringBoot打包插件，当然也可以使用assembly进行打包。引入打包插件之后，mvn package 就可以打成可执行的jar！

#### 参与贡献

1. Fork 本项目
2. 新建 Feat_xxx 分支
3. 提交代码
4. 新建 Pull Request
