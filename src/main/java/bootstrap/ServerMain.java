package bootstrap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.obob.db.MyBatisDao;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.obob.miniprogram.*"})
@MapperScan(annotationClass=MyBatisDao.class, basePackages="com.obob.miniprogram.dao")
@ImportResource({"classpath:/spring/spring-context.xml"})
public class ServerMain extends SpringBootServletInitializer {
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServerMain.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ServerMain.class, args);
	}
}
