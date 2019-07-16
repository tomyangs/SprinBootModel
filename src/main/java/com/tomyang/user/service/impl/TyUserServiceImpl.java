package com.tomyang.user.service.impl;

import com.tomyang.user.entity.TyUser;
import com.tomyang.user.mapper.TyUserMapper;
import com.tomyang.user.service.ITyUserService;
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
public class TyUserServiceImpl extends ServiceImpl<TyUserMapper, TyUser> implements ITyUserService {

}
