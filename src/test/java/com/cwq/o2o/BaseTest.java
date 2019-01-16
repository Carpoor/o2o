package com.cwq.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
 * spring与Junit的整合，Junit启动的时候加载spring IOC 容器
 * @author Carpoor  
 * @date 2019年1月16日 
 */
@RunWith(SpringJUnit4ClassRunner.class)
//加载所有spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class BaseTest {

}
