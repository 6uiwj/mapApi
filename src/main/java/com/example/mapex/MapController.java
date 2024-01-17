package com.example.mapex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {
    @GetMapping("/mapPage")
    public String MapPage() {
        return "map/mapPage2";
    }
}
