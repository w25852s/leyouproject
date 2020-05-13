package com.wangshuai.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name="tb_user")
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;

    private String username;
    @JsonIgnore
    private String password;

    private String phone;


    private Date created;

    @JsonIgnore
    private String salt;
}
