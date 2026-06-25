package com.rccl.rccldemoproject.handler;

import com.rccl.rccldemoproject.model.Request;
import com.rccl.rccldemoproject.model.Response;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


public class HelloWorldLambda implements RequestHandler<Request, Response> {

    @Override
    public Response handleRequest(Request request, Context context) {

        context.getLogger().log("Received request");

        String name = request.getName() != null
                ? request.getName()
                : "Guest";

        return new Response(
                "Hello " + name + ", Welcome to AWS Lambda Java 17!"
        );
    }
}
