package com.techhybris.alexa;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.techhybris.alexa.data.HandlerDetails;

public class LambdaFunctionHandler extends SkillStreamHandler {

    private static Skill getSkill() {
    	HandlerDetails handlerDetails =Application.getBean(HandlerDetails.class);
    	
        return Skills.standard()
                .addRequestHandlers(handlerDetails.getHandlerList())
                .build();
    }

    public LambdaFunctionHandler() {
        super(getSkill());
    }

}
