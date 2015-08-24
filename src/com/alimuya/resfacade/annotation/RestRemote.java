package com.alimuya.resfacade.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**拥有该注解的bean，可用于restful组件，发送或获取数据
 * @author alimuya
 *
 */
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RestRemote {
	/** REST风格的path部分已经query部分
	 * @return
	 */
	String value();
	
}
