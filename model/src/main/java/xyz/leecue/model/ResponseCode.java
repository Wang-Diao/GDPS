package xyz.leecue.model;

/**
 * @author LeeCue
 * @date 2021-03-19
 */
public enum ResponseCode {
    /**
     * 请求成功
     */
    SUCCESS(200, "请求成功"),
    /**
     * 尚未登录时
     */
    NOT_LOGIN(206, "尚未登录，请登录"),
    /**
     * 未知错误
     */
    ERROR(406, "未知错误");

    ResponseCode(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    private final int status;
    private final String msg;
}
