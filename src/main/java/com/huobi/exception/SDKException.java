package com.huobi.exception;

import lombok.Getter;

@Getter
public class SDKException extends RuntimeException {

  public static final String INPUT_ERROR = "InputError";

  public static final String RUNTIME_ERROR = "RuntimeError";

  public static final String ENV_ERROR = "EnvironmentError";

  public static final String EXEC_ERROR = "ExecuteError";

  private final String errCode;

  public SDKException(String errCode, String errMsg) {
    super(errMsg);
    this.errCode = errCode;
  }

}
