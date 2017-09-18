package com.hgy.util.enums;

public enum ResultType {

	SUCCESS(0, "操作成功"),
	FAILURE(-22,"操作失败"),
	WRONG_NAME_OR_PWD(-1,"账号或密码错误"),
	WRONG_JSON_TO_OBJECT(-2,"Json数据格式错误"),
	WRONG_TELEPHONE(-3,"手机号码不存在"),
	WRONG_CAPTCHA_CREATE(-4, "验证码生成错误"),
	WRONG_TELEPHONE_CAPTCHA(-5, "验证码验证失败"),
	WRONG_PASSWORD_RESET(-6, "密码充值是失败"),
	WRONG_USER_EXIST(-7, "用户已存在"),
	WRONG_LOGIN_CLOSE(-8, "账户不可用"),
	WRONG_LOGIN_OTHER(-9, "登录信息其他错误"),
	WRONG_APPLY_OPERATION(-10, "请求信息格式错误"),
	WRONG_PWD(-11,"密码错误"),
	WRONG_TIMEOUT(-12,"登录超时"),
	WRONG_UPLOAD(-13,"上传数据失败"),
	WRONG_CREATEFILE(-14,"创建文件失败"),
	WRONG_WRITEFILE(-15,"写文件失败"),
	WRONG_CLOUSE_OUTPUTSTREAM(-16,"关闭输出流失败"),
	WRONG_HOSPITAL_DELETE(-17,"医院信息不能被删除"),
    WRONG_STATISTICS_NULL(-18,"统计数据查询失败"),
	WRONG_HOSPITAL_QUERY(-19,"查询医院信息失败"),
	WRONG_DOUBLE_SUBMIT(-20,"重复提交");

	private int code;
	private String info;

	ResultType(int code, String info) {
		this.code = code;
		this.info = info;
	}

	public int getCode() {
		return code;
	}

	public String getInfo() {
		return info;
	}

}
