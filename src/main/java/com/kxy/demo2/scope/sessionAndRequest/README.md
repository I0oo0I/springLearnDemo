session和request作用域    回话和请求作用域

在web应用中，在实例化爱回话和请求作用域中共享，是一件很有用的事情。

典型的例子，淘宝买东西，用一个bean叫购物车
	1. 若购物车bean是单例的（sington）， 	那么所有的用户都会共享同一个购物车，所有的商品都会加入到同一个购物车
	2. 若购物车bean是原型（多例，prototype）, 那么同一用户每买一个物品，都会生成一个购物车，买了几次就会生成几个购物车

就购物车而言，回话作用域是最实用的

session和request作用域的区别 ？
	具体请看  com.kxy.demo.contoller.TestController 的演示
	

在xml中配置scope
<bean id="" class="" scope="session"><aop:scoped-proxy  proxy-target-class="false" /></bean>
proxy-target-class 默认是true, 是基于类的代理， 等同于 proxyMode=ScopedProxyMode.TARGET_CLASS	（要被代理的对象是实体类）
proxy-target-class="false", 是基于接口的代理，等同于 proxyMode=ScopedProxyMode.INTERFACE	（要被代理的对象是接口）