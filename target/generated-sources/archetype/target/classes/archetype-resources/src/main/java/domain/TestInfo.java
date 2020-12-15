#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain;

import lombok.Data;

/**
 * @author liulv
 * @since ${version}
 * <p>
 * 说明：
 */
@Data
public class TestInfo {
    private long id;
    private String name;
    private int age;
    private int xb;
}
