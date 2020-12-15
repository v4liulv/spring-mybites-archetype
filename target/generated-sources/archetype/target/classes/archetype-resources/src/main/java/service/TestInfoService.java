#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import ${package}.domain.TestInfo;

import java.util.List;

/**
 * @author liulv
 * @since ${version}
 * <p>
 * 说明：
 */
public interface TestInfoService {
    public void saveData(TestInfo testInfo);

    public TestInfo selectById(Integer id);

    public List<TestInfo> selectList();
}
