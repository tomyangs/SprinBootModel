package com.tomyang.ssm.service.impl;

import com.tomyang.ssm.entity.Company;
import com.tomyang.ssm.mapper.CompanyMapper;
import com.tomyang.ssm.service.ICompanyService;
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
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
