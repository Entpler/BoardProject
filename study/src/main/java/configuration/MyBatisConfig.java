package configuration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;


@SpringBootApplication
@Configuration
@MapperScan("com.spring.study.service")//스캔할 Mapper 인터페이스가 있는 패키지를 지정
public class MyBatisConfig {

    @Autowired
    private  DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        // MyBatis 설정 파일 경로 설정
        sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        return sessionFactory.getObject();

        



    }
}

