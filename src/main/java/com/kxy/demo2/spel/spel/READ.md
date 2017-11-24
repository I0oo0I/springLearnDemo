spel 表达式  要放在 #{}之中 ，和 属性占位符很相似，属性占位符需要放在 ${} 之中

1. 强大和简洁的方式将 值 装配到 bean属性 和 构造参数中

2. SpEL的特性
	1. 通过bean的id来引用bean（应该是通过bean的名字来引用bean）； #{modelBean.title} 得到modelBean的这个bean的title属性的值
	2. 调用方法和引用对象的属性；		#{T(java.lang.System).currentTimeMillis()} 引用类作用域的方法和属性      #{T(java.lang.Math).PI}
								#{systemProperties['disc.title']} systemProperties对象，引用系统属性
	3. 对值进行算术、关系和逻辑运算；	#{1}  #{3.14} #{'hello'} #{false}， #{1+2*T(java.lang.Math).PI*circle.radius} circle是一个bean
	4. 正则表达式的配合；
	5. 集合的操作。