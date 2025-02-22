package com.nie.controller;



import com.nie.Form.PatientLoginForm;
import com.nie.VO.PatientLoginVO;
import com.nie.service.PatientLoginService;
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
@RequestMapping("/patient")
public class PatientLoginController {
        @Autowired
        PatientLoginService patientLoginService;

        @GetMapping("/login")
        public PatientLoginVO login(PatientLoginForm patientLoginForm) {
                PatientLoginVO patientLoginVO = this.patientLoginService.login(patientLoginForm);
                return patientLoginVO;
        }
}
