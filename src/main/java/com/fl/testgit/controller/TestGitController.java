package com.fl.testgit.controller;

import com.fl.testgit.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: test-git
 * @Package: com.fl.testgit.controller
 * @ClassName: TestGitController
 * @Author: 简鑫鑫
 * @Description:
 * @Date: 2022/2/8 19:25
 * @Version: 1.0
 */
@Controller
public class TestGitController {
    @GetMapping("/jxx")
    @ResponseBody
    public String returnTable(Model model){
        User user = new User();

        String name = "jxx";
        String sex = "male";
        String age = "222222233334444";

        user.setName(name);
        user.setSex(sex);
        user.setAge(age);
        model.addAttribute("user",user);

        return "我是";
    }
}
