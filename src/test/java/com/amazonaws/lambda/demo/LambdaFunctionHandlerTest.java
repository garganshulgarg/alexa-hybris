package com.amazonaws.lambda.demo;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.jupiter.api.Test;

import com.techhybris.alexa.LambdaFunctionHandler;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class LambdaFunctionHandlerTest {

    private static final String SAMPLE_INPUT_STRING = "{\"foo\": \"bar\"}";
    private static final String EXPECTED_OUTPUT_STRING = "{\"FOO\": \"BAR\"}";

    @Test
    public void testLambdaFunctionHandler() throws IOException {
    	InputStream inputStream       = new FileInputStream("src/main/resources/sample_files/welcome-hybris.json");
        LambdaFunctionHandler handler = new LambdaFunctionHandler();
        OutputStream output = new ByteArrayOutputStream();

        handler.handleRequest(inputStream, output, null);

        // TODO: validate output here if needed.
        String sampleOutputString = output.toString();
        System.out.println(sampleOutputString);
    }
}
