package com.nie.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author nie
 * @since 2025-02-19
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Doctor implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * id
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      /**
     * 姓名
     */
      private String name;

      /**
     * 联系方式
     */
      private String phone;

      /**
     * 密码
     */
      private String password;

      /**
     * 院名
     */
      private String hospital;

      /**
     * 科室名
     */
      private String office;

      /**
     * 医生公钥
     */
      private String publicKey;


}
