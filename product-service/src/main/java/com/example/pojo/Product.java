package com.example.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 功能描述: 商品列表实体
 *
 * @author lizongzai
 * @date 2023/03/08 15:45
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_product")
@ApiModel(value = "Product对象", description = "")
public class Product implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "商品ID")
  @TableId(value = "id", type = IdType.AUTO)
  private Integer id;

  @ApiModelProperty(value = "商品名称")
  private String productName;

  @ApiModelProperty(value = "商品数量")
  private Integer productNum;

  @ApiModelProperty(value = "商品价格")
  private Double productPrice;


}
