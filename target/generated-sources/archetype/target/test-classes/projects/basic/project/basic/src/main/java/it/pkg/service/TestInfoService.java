package it.pkg.service;

import it.pkg.domain.TestInfo;

import java.util.List;

/**
 * @author liulv
 * @since 0.1-SNAPSHOT
 * <p>
 * 说明：
 */
public interface TestInfoService {
    public void saveData(TestInfo testInfo);

    public TestInfo selectById(Integer id);

    public List<TestInfo> selectList();
}
