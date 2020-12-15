package com.tcfuture.web.service.impl;

import com.tcfuture.web.dao.TestInfoMapper;
import com.tcfuture.web.domain.TestInfo;
import com.tcfuture.web.service.TestInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liulv
 * @since 1.0.0
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
