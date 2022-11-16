package cn.ken.student.rubcourse.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 系统日志表
 * </p>
 *
 * @author Ken-Chy129
 * @since 2022-11-16
 */
@Data
@TableName("scc_sys_log")
@ApiModel(value = "SysLog对象", description = "系统日志表")
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @ApiModelProperty("请求ip")
    private Integer requestIp;

    @ApiModelProperty("学生学号")
    private Integer studentId;

    @ApiModelProperty("请求凭证")
    private Long token;

    @ApiModelProperty("请求接口")
    private String requestApi;

    @ApiModelProperty("请求体")
    private String requestBody;

    @ApiModelProperty("响应体")
    private String responseBody;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

}
