package com.fl.testgit.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ProjectName: test-git
 * @Package: com.fl.testgit.bean
 * @ClassName: User
 * @Author: 简鑫鑫
 * @Description:
 * @Date: 2022/2/8 19:30
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String name;
    String sex;
    String age;
}
