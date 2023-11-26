package com.aiyouv.demo.repository.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName()
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;
}