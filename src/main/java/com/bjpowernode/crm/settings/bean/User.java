package com.bjpowernode.crm.settings.bean;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName User
 * @Description 一句话描述此类或方法的作用
 * @Author PowerNode
 * @Date 2020/11/16 20:22
 * @Version 1.0
 */
@Table(name ="tbl_user")
public class User {

    @Id
    private String id;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
