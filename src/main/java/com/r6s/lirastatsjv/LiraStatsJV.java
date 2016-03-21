package com.r6s.lirastatsjv;

import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;

public class LiraStatsJV {
    public static void main(String args[]) {

	staticFileLocation("/public");
        
        get("/", (request, response) -> {
            
            Map<String, Object> viewObjects = new HashMap<>();
            return modelAndView(viewObjects, "index.ftl");
        }, new FreeMarkerEngine());

    }
}
