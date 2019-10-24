package pers.sanmu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 该类是一个配置类,作用和bean.xml是一样的
 * @ComponentScan
 *      指定spring在创建容器时要扫描的包
 *      value跟basePackages的作用时一样的。
 */

@Configuration
@ComponentScan(value = "pers.sanmu")
public class SpringConfiguration {



}
