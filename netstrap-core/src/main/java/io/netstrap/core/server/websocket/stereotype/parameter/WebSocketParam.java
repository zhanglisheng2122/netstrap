package io.netstrap.core.server.websocket.stereotype.parameter;

import io.netstrap.core.server.http.router.HttpContextType;
import io.netstrap.core.server.websocket.router.WebSocketContextType;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * WebSocket请求URI参数
 *
 * @author minghu.zhang
 */
@Target(value = {ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@WebSocketValue(type = WebSocketContextType.REQUEST_PARAM)
public @interface WebSocketParam {

    /**
     * 参数名
     */
    @AliasFor(annotation = WebSocketValue.class)
    String value() default "";
}
