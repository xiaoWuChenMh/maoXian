package com.maoxian.manager.service.impl.permissions;

import com.maoxian.manager.service.permissions.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by hui on 2016/3/8.
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("Service 调用正常!!!!!!!");
    }
}
