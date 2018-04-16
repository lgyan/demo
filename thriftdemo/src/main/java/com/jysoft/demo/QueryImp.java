package com.jysoft.demo;

import com.jysoft.demo.thrift.QryResult;
import com.jysoft.demo.thrift.TestQry;
import org.apache.thrift.TException;

public class QueryImp implements TestQry.Iface {

    public QryResult qryTest(int qryCode) throws TException {
        QryResult result = new QryResult();
        if (qryCode == 1) {
            result.setCode(1);
            result.setMsg("success");
        } else {
            result.setCode(0);
            result.setMsg("fail");
        }
        return result;
    }
}
