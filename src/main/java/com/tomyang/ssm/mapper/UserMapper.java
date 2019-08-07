package com.tomyang.ssm.mapper;

import com.tomyang.ssm.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.Mapping;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-07-16
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
