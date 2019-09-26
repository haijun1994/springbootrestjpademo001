package com.offcn.dao;

import com.offcn.po.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
//自定义请求路径
//@RepositoryRestResource(path = "java001")

//隐藏路径，外径无法访问
//@RepositoryRestResource(exported = false)

//跨域请求
//@CrossOrigin

public interface PersonDao extends JpaRepository<Person,Long> {

    @RestResource(path = "findbyname")
   public Person findByNameEquals(@Param("name") String name);
}
