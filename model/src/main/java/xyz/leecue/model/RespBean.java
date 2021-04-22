package xyz.leecue.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author LeeCue
 * @date 2021-03-19
 */
@NoArgsConstructor
@Data
@ToString
@ApiModel(value = "统一响应对象实体", description = "所有接口下，统一返回的对象实体")
public class RespBean {
    @ApiModelProperty(value = "状态码", example = "200", required = true)
    private int status;
    @ApiModelProperty(value = "消息", example = "用户请求成功", required = true)
    private String msg;
    @ApiModelProperty(value = "携带对象", example = "json format", required = false)
    private Object object;

    public RespBean(ResponseCode responseCode) {
        this.status = responseCode.getStatus();
        this.msg = responseCode.getMsg();
    }
    public RespBean(ResponseCode responseCode, Object object) {
        this.status = responseCode.getStatus();
        this.msg = responseCode.getMsg();
        this.object = object;
    }

    public RespBean(int status, String msg, Object object) {
        this.status = status;
        this.msg = msg;
        this.object = object;
    }
}
