package com.tcfuture.web.dao;

import com.tcfuture.web.domain.TestInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author liulv
 * @since 1.0.0
 * <p>
 * 说明：
 */
@Mapper
public interface TestInfoMapper {
    // 写入数据
    void saveData (TestInfo testInfo) ;
    // ID 查询
    TestInfo selectById (@Param("id") Integer id) ;
    // 查询全部
    List<TestInfo> selectList ();
}
