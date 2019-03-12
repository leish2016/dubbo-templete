package com.tfb.provider.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
public class Userinfo implements Serializable {
    /**
     * 编号
     */
    @Id
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 创建时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 更新时间
     */
    @Column(name = "update_at")
    private Date updateAt;

    private static final long serialVersionUID = 1L;
}