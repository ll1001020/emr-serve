package com.nie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nie.Form.PatientLoginForm;
import com.nie.VO.PatientLoginVO;
import com.nie.pojo.Patient;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author nie
 * @since 2025-02-19
 */
public interface PatientLoginService extends IService<Patient> {
    public PatientLoginVO login(PatientLoginForm patientLoginForm);
}
