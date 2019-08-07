package com.tomyang.ssm.service.impl;

import com.tomyang.ssm.entity.User;
import com.tomyang.ssm.mapper.UserMapper;
import com.tomyang.ssm.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-07-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
