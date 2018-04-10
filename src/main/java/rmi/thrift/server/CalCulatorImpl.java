package rmi.thrift.server;

import org.apache.thrift.TException;

public class CalCulatorImpl implements  Calculator.Iface {
    @Override
    public void ping() throws TException {
        System.out.println("pong........");
    }

    @Override
    public int add(int num1, int num2) throws TException {
        return num1 + num2;
    }
}
