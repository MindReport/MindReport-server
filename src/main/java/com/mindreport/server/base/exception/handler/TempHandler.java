package com.mindreport.server.base.exception.handler;

import com.mindreport.server.base.code.BaseErrorCode;
import com.mindreport.server.base.exception.GeneralException;

public class TempHandler extends GeneralException {
    public TempHandler(BaseErrorCode code) {
        super(code);
    }
}
