Spring对AOP的支持

Spring提供了4中对AOP的支持
	1. 基于代理的经典Spring AOP		（笨重复杂）
	2. 纯POJO切面					（用到xml配置，实际上只用到了POJO的方法，比如before调用什么方法，after调用什么方法）
	3. @AspectJ注解驱动的切面		（和2一样基于代理的AOP，但是是基于注解，不使用xml配置）
	4. 注入式AspectJ切面			（超过了方法级别，如果是（构造器或属性拦截，以上3中不行），必须考虑使用AspectJ来实现切面）
	
Spring的切面和AspectJ比较
	Spring的通知完全是基于标准的java类，可以使用注解和xml配置
	AspectJ也支持注解，基于java的扩展，也更强的功能和细粒度的控制，但是要学习新的工具和语法

通过切点来筛选连接点，Spring支持的AspectJ切点指示器  （带尝试一下功能）
	arg()		限制连接点匹配 参数为指定类型的执行方法
	@arg()		限制连接点匹配注解方式参数为指定类型的执行方法
	execution	用于匹配是连接点的执行方法
	this		限制连接点匹配AOP代理的bean引用为指定类型的类
	target		限制连接点匹配目标对象为指定类型的类
	@target()	限制连接点匹配特定的执行对象，这些对象对应的类要具有指定类型的注解
	within()	限制连接点匹配指定的类型
	@within()	限制连接点匹配指定注解所标注的类型（当使用Spring AOP时，方法定义在由指定的注解所标注的类里）
	@annotation	限定匹配带有指定注解的连接点
除了以上指示器，在Spring中使用其他的AspectJ指示器，会报错

遗留问题，直接使用AspectJ创建切面？？？

