package com.nie.controller;


import com.nie.Form.DoctorLoginForm;
import com.nie.VO.DoctorLoginVO;
import com.nie.service.DoctorLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author nie
 * @since 2025-02-19
 */
@RestController
@RequestMapping("/doctor")
public class DoctorLoginController {
        @Autowired
        DoctorLoginService doctorLoginService;

        @GetMapping("/login")
        public DoctorLoginVO login(DoctorLoginForm doctorLoginForm) {
                DoctorLoginVO doctorLoginVO = this.doctorLoginService.login(doctorLoginForm);
                return doctorLoginVO;
//                return doctorService.login(loginForm);
        }
}
