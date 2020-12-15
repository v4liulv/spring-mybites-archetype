#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import ${package}.dao.TestInfoMapper;
import ${package}.domain.TestInfo;
import ${package}.service.TestInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liulv
 * @since ${version}
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
