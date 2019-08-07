package com.tomyang.ssm.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-07-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名称信息
     */
    private String username;

    /**
     * 用户密码信息
     */
    private String password;

    /**
     * 部门id
     */
    private Integer departmentId;


}
