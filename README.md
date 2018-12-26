# Netstrap

#### 项目介绍
Web development framework based on Spring Boot and Netty. Spring module is integrated with XML configuration file, Starter dependency is removed, and a set of web containers for production is fully realized.

#### Maven引入netstrap

```
<dependency>
    <groupId>io.netstrap</groupId>
    <artifactId>netstrap-core</artifactId>
    <version>${version}</version>
</dependency>
```

#### 启动示例

```
15:27:46.229 [main] INFO  io.netstrap.core.server.netty.NettyServer - The server bind IP:0.0.0.0 , PORT:9000
15:27:46.233 [main] INFO  io.netstrap.core.server.NetstrapBootApplication - The network service is starting.
15:27:46.276 [main] INFO  io.netstrap.core.server.context.LogoApplicationListener - Printing logo, wait a moment...

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

15:27:46.277 [main] INFO  io.netstrap.core.server.context.LogoApplicationListener - The server started successfully.
```


HTTP 应用请看：[HTTP示例](https://github.com/minghu-zhang/netstrap/blob/master/HTTP.md)  
Websocket应用：[WEB_SOCKET示例](https://github.com/minghu-zhang/netstrap/blob/master/WEB_SOCKET.md)

#### 多人点餐场景示例

该场景基于netstrap -> WebSocketServer [多人点餐](http://paylist.instanceof.cn)
```
用户名：  test01 - test06
默认密码：123456
```

![默认页面](https://images.gitee.com/uploads/images/2018/1226/155405_c447ed81_679674.png "QQ截图20181226154552.png")
![用户加入](https://images.gitee.com/uploads/images/2018/1226/155423_b2e782e7_679674.png "QQ截图20181226154628.png")
![参与聊天](https://images.gitee.com/uploads/images/2018/1226/155501_fc715360_679674.png "QQ截图20181226154743.png")