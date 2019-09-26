package com.offcn.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity   //声明是一张表
@Table(name = "tb_person") //表的名字
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id //主键
    @GeneratedValue  //自增
    private Long id;

    @Column(name = "name",nullable = false,length = 100)
    private String name;

    private Integer age;

}
