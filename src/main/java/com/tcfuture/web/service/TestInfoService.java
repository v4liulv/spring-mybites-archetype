package com.tcfuture.web.service;

import com.tcfuture.web.domain.TestInfo;

import java.util.List;

/**
 * @author liulv
 * @since 1.0.0
 * <p>
 * 说明：
 */
public interface TestInfoService {
    public void saveData(TestInfo testInfo);

    public TestInfo selectById(Integer id);

    public List<TestInfo> selectList();
}
