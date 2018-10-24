package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping
    public String tran(@RequestParam("word") String word, Model up) {
        String vn;
        switch (word) {
            case "hello":
                vn = "xin chao";
                break;
            case "hi":
                vn = "chao";
                break;
            case "what":
                vn = "cai gi";
                break;
            case "where":
                vn = "o dau";
                break;
            default:
                vn = "từ không có trong từ điển";
                break;
        }
        up.addAttribute("word",word);
        up.addAttribute("vn",vn);
        return "changed";
    }
}
