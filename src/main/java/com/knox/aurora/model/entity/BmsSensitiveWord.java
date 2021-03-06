package com.knox.aurora.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 敏感词
 *
 * @author Knox
 */
@Data
@TableName("bms_sensitive_word")
@Accessors(chain = true)
public class BmsSensitiveWord implements Serializable {

    private static final long serialVersionUID = -1150568252594574515L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @TableField("word")
    private String word;
}
