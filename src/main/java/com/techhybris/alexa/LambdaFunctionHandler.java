package com.techhybris.alexa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.techhybris.alexa.data.HandlerDetails;

public class LambdaFunctionHandler extends SkillStreamHandler {

    private static Skill getSkill() {
    	ApplicationContext context = new ClassPathXmlApplicationContext("resources/main-spring-config.xml");
    	HandlerDetails handlerDetails = (HandlerDetails) context.getBean("handlerDetails");
    	
        return Skills.standard()
                .addRequestHandlers(handlerDetails.getHandlerList())
                .build();
    }

    public LambdaFunctionHandler() {
        super(getSkill());
    }

}
