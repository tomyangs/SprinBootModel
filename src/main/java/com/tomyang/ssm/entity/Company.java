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
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司统一社会信用代码
     */
    private String companyId;

    /**
     * 公司地址
     */
    private String companyAddress;


}
