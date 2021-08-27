package fun.qiutiandog.mybatisdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 主页控制器
 *
 * @author QiutianDog
 * @version 1.0
 * @date 2021/8/27
 */
@Controller
public class IndexController {
    @GetMapping
    public String index(){
        return "index";
    }
}
