package com.luisjaramillo.playamovie.domain.service;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface MovieAIService {
    @UserMessage(value = "\"Genera un saludos de bienvenida al portafolio {{appName}}\"")
    String generateGreeting(@V("appName") String appName);
}
