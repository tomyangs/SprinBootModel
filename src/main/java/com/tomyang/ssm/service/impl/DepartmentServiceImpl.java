package com.tomyang.ssm.service.impl;

import com.tomyang.ssm.entity.Department;
import com.tomyang.ssm.mapper.DepartmentMapper;
import com.tomyang.ssm.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
