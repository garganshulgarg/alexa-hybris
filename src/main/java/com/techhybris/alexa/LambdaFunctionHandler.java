package com.techhybris.alexa;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.techhybris.alexa.handler.CancelandStopIntentHandler;
import com.techhybris.alexa.handler.FallbackIntentHandler;
import com.techhybris.alexa.handler.WelcomeHybrisIntentHandler;
import com.techhybris.alexa.handler.LaunchRequestHandler;
import com.techhybris.alexa.handler.SessionEndedRequestHandler;

public class LambdaFunctionHandler extends SkillStreamHandler {

    private static Skill getSkill() {
    	RequestHandler cancelHandler = new CancelandStopIntentHandler();
    	RequestHandler fallbackHandler = new FallbackIntentHandler();
    	RequestHandler helloWorldHandler = new WelcomeHybrisIntentHandler();
    	RequestHandler helpHandler = new WelcomeHybrisIntentHandler();
    	RequestHandler launchRequestHandler = new LaunchRequestHandler();
    	RequestHandler sessionEndedHandler = new SessionEndedRequestHandler();
    	
        return Skills.standard()
                .addRequestHandlers(
                		cancelHandler,
                		helloWorldHandler,
                		helpHandler,
                		launchRequestHandler,
                		sessionEndedHandler,
                        fallbackHandler)
                // Add your skill id below
                //.withSkillId("")
                .build();
    }

    public LambdaFunctionHandler() {
        super(getSkill());
    }

}
