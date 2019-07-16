package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {
    @GetMapping("/dictionary")
    public String dictionary(@RequestParam String word, Model model){
        String result;
        switch (word){
            case "Hello":{
                result = "Xin Chào";
                break;
            }
            case "Bye":{
                result = "Tạm Biệt";
                break;
            }

            default:
                throw new IllegalStateException("Unexpected value: " + word);
        }
        model.addAttribute("word",word);
        model.addAttribute("result",result);
        return "dictionary";
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
