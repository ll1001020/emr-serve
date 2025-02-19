package com.nie.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
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
    public class AuthorSize implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * id
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      /**
     * 医生id
     */
      private Long doctorId;

      /**
     * 患者id
     */
      private Long patientId;

      /**
     * 档案创建时间
     */
        @TableField(fill = FieldFill.INSERT)
      private Date createTime;

      /**
     * 医生诊断（患者公钥加密）
     */
      private String descriptionEnbyd;

      /**
     * 备注（患者公钥加密）
     */
      private String remarkEnbyd;

      /**
     * 是否确认（0为未确认，1为确认）
     */
      private Integer state;


}
