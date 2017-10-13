package com.kxy.demo1.soundSystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  //使用SpringJunit4ClassRunner创建spring的上下文
//@ContextConfiguration(classes=CDPlayerConfig.class)		//告诉在CDPlayerConfig中加载配置
@ContextConfiguration(classes=CDPlayerConfig2.class)		//告诉在CDPlayerConfig中加载配置
public class JunitTest {

	@Autowired 		//装配注入bean
	private CD cd;
	
	@Autowired
	private InstantiationTracingBeanPostProcessor ins;
	
	@Autowired
	@Qualifier("cdPlayer1")
	private CDPlayer cdPlayer1;
	
	@Autowired
	@Qualifier("cdPlayer2")
	private CDPlayer cdPlayer2;
	
	@Test
	public void playCd(){
		cd.play();
		ins.toString();
		assertNotNull(cd);
	}
	
	//测试两个bean,同时注入另一个bean,判断两个bean使用的是同一个目标bean，还是各自创建的新的实例（即判断spring中bean是不是单例的）
	//做法：在CdPlay的构造函数中，注入MusicCd的bean，cdPlayer1调用PlayNewCd()时，修改MusicCD的name属性值，cdPlayer再次调用
	//MusicCd中打印name值的方法
	//结果：在cdPlayer1中修改的MusicCd的name属性值，影响到了cdPlayer2.
	//结论: spring中的bean是单例的
	@Test
	public void TestSameSampleOfBean(){
		cdPlayer1.playNewCd();
		System.out.println("============================分割线=================================");
		cdPlayer2.playCD();
	}
}
