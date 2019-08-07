package com.tomyang.ssm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Userone implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ids", type = IdType.AUTO)
    private Long ids;

    private String username;

    private Boolean sex;


}
