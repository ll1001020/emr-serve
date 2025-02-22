package com.nie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nie.Form.PatientLoginForm;
import com.nie.VO.PatientLoginVO;
import com.nie.mapper.PatientLoginMapper;
import com.nie.mapper.PatientMapper;
import com.nie.pojo.Patient;
import com.nie.service.PatientLoginService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class PatientLoginServiceImpl extends ServiceImpl<PatientMapper, Patient> implements PatientLoginService {
    @Autowired
    PatientLoginMapper patientLoginMapper;
    @Override
    public PatientLoginVO login(PatientLoginForm patientLoginForm){
        QueryWrapper<Patient> queryWrapper = new QueryWrapper<Patient>();
        queryWrapper.eq("phone", patientLoginForm.getPhone());
        Patient patient = patientLoginMapper.selectOne(queryWrapper);
        PatientLoginVO patientLoginVO = new PatientLoginVO();
        if(patient == null){
            patientLoginVO.setCode(-1);// 1.判断手机号是否存在
        }else{
            if(!patient.getPassword().equals(patientLoginForm.getPassword())){
                patientLoginVO.setCode(-2);
            }else{
                patientLoginVO.setCode(0);// 2.判断密码是否正确
                patientLoginVO.setData(patient);
            }
        }
        return patientLoginVO;
    }
}
