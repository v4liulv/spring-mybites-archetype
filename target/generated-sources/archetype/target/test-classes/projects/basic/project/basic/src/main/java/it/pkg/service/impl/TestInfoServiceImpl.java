package it.pkg.service.impl;

import it.pkg.dao.TestInfoMapper;
import it.pkg.domain.TestInfo;
import it.pkg.service.TestInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liulv
 * @since 0.1-SNAPSHOT
 * <p>
 * 说明：
 */
@Service
public class TestInfoServiceImpl implements TestInfoService {

    @Resource
    private TestInfoMapper testInfoMapper;

    @Override
    public void saveData(TestInfo testInfo) {
        testInfoMapper.saveData(testInfo);
    }

    @Override
    public TestInfo selectById(Integer id) {
        return testInfoMapper.selectById(id);
    }

    @Override
    public List<TestInfo> selectList() {
        return testInfoMapper.selectList();
    }
}
