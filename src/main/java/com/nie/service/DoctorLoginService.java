package com.nie.service;

import com.nie.Form.DoctorLoginForm;
import com.nie.VO.DoctorLoginVO;
import com.nie.pojo.Doctor;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author nie
 * @since 2025-02-19
 */
public interface DoctorLoginService extends IService<Doctor> {
    public DoctorLoginVO login(DoctorLoginForm doctorLoginForm);
}
