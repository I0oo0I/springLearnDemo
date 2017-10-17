package com.kxy.demo2.autowire;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 使用@Primary，表明在出现歧义的时候，主要选的是有primary标注的bean，查看 Test
 * @author Administrator
 *
 */
@Component
@Primary
public class IceCream implements Dessert{

}
