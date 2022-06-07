package com.example.mytest.common;

/**
 * @author 韩秋林
 * @create 2022-06-05-11:38
 * @describe
 */
public class Result<T>{
    private String code;
    private String message;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Result() {
    }

    public Result(T data) {
        this.data = data;
    }

    public static Result success(){
        Result result = new Result();
        result.setCode("200");
        result.setMessage("发送成功");
        return result;
    }
    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>(data);
        result.setCode("200");
        result.setMessage("发送成功");
        return result;
    }
    public static Result error(String code,String message){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
