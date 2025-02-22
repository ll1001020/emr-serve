package com.nie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nie.Form.DoctorLoginForm;
import com.nie.VO.DoctorLoginVO;
import com.nie.pojo.Doctor;
import com.nie.mapper.DoctorLoginMapper;
import com.nie.service.DoctorLoginService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class DoctorLoginServiceImpl extends ServiceImpl<DoctorLoginMapper, Doctor> implements DoctorLoginService {
        @Autowired
        DoctorLoginMapper doctorLoginMapper;
        @Override
        public DoctorLoginVO login(DoctorLoginForm doctorLoginForm){
            QueryWrapper<Doctor> queryWrapper = new QueryWrapper<Doctor>();
            queryWrapper.eq("phone", doctorLoginForm.getPhone());
            Doctor doctor = doctorLoginMapper.selectOne(queryWrapper);
            DoctorLoginVO doctorLoginVO = new DoctorLoginVO();
            if(doctor == null){
                doctorLoginVO.setCode(-1);// 1.判断手机号是否存在
            }else{
                if(!doctor.getPassword().equals(doctorLoginForm.getPassword())){
                    doctorLoginVO.setCode(-2);
                }else{
                    doctorLoginVO.setCode(0);// 2.判断密码是否正确
                    doctorLoginVO.setData(doctor);
                }
            }
            return doctorLoginVO;
        }
}
