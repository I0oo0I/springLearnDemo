package com.kxy.demo2.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 可以看做是条件，实现condition接口，覆盖matchs方法，mathces方法return false时，运行ConditionlTest测试方法，发现bean创建失败
 * @author Administrator
 *
 */
public class MagiceExsitsCondition implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		Environment e = context.getEnvironment();
		String name = "aa";
		if(e.containsProperty(name)){
			return true;
		}
		return false;
	}

}
