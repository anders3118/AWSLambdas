package com.kuiper.lambda.example01;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        
        String name = System.getenv().get("NAME");
        

        // TODO: implement your handler
        return "Hello Mr. " + name + ", " + input;
    }

}
