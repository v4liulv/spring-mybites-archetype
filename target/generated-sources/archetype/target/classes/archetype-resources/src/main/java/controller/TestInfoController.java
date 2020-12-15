#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import ${package}.domain.TestInfo;
import ${package}.service.TestInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liulv
 * @since ${version}
 * <p>
 * 说明：
 */
@Api(tags = "测试操作功能接口")
@RestController
@RequestMapping("/test")
public class TestInfoController {

    @Resource
    private TestInfoService TestInfoService ;

    @ApiOperation(value = "保存用户信息", notes = "访问此接口, 传递用户相关信息保存用户信息")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "接口返回成功状态"),
            @ApiResponse(code = 500, message = "接口返回未知错误，请联系开发人员调试")
    })
    @PostMapping("/saveData")
    public String saveData (@RequestBody TestInfo TestInfo){
        TestInfoService.saveData(TestInfo);
        return "sus";
    }

    @ApiOperation(value = "根据ID查询用户信息")
    @GetMapping("/selectById")
    public TestInfo selectById () {
        return TestInfoService.selectById(1) ;
    }

    @ApiOperation(value = "用户全查接口", notes = "访问此接口, 返回全部用户信息")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "接口返回成功状态"),
            @ApiResponse(code = 500, message = "接口返回未知错误，请联系开发人员调试")
    })

    @GetMapping("/selectList")
    public List<TestInfo> selectList () {
        return TestInfoService.selectList() ;
    }
}
