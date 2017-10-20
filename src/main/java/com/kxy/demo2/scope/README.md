bean的作用域4种
	单例(Singleton)	整个应用中只会创建一个bean
	原型(ProtoType)	每次注入或者通过spring上下文获取的时候，都会创建一个新的实例
	回话(Session)	web应用中，为每一个回话创建一个bean
	请求(Request)	为每一个请求创建一个bean实例