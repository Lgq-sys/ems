package cn.lgqyun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//扫描DAO所在的包   创建DAO对象并交给Spring工厂
@MapperScan("cn.lgqyun.dao")
@SpringBootApplication
public class EmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmsApplication.class, args);
    }
}