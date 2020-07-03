package com.tqfframe.common.annotation;

import com.tqfframe.common.config.fistStarter.FristAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author: 唐祺峰
 * @Date: 2020/7/3 0003 9:52
 * @Version 1.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({FristAutoConfiguration.class})
public @interface EnableFirstStarter {
}
