package main;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class RecomendAround implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        // ������� ���� before, ����� �������� before �� after, ���� ������ methodInvocation � ��� ����� proceed
        // before
        System.out.println("Before method in Around class");

        //����������� ��� �����
        Object obj = null;
        obj = methodInvocation.proceed();

        // after
        System.out.println("After method in Around class");
        return obj;
    }
}
