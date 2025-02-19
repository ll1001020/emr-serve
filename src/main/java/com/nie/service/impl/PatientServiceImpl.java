package com.nie.service.impl;

import com.nie.pojo.Patient;
import com.nie.mapper.PatientMapper;
import com.nie.service.PatientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author nie
 * @since 2025-02-19
 */
@Service
public class PatientServiceImpl extends ServiceImpl<PatientMapper, Patient> implements PatientService {

}
