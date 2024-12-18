package com.tracodearchquoteapi.quote_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;

@RestController
public class QuoteGeneratorController {
    @GetMapping(path = "/quote")
    public String getQuote() {
        ArrayList<String> quotes = new ArrayList<>();
        Random random = new Random();

        quotes.add("Code is like humor. When you have to explain it, it’s bad.");
        quotes.add("First, solve the problem. Then, write the code.");
        quotes.add("Experience is the name everyone gives to their mistakes.");
        quotes.add("Programming isn’t about what you know; it’s about what you can figure out.");
        quotes.add("Code never lies, comments sometimes do.");

        return quotes.get(random.nextInt(quotes.size()));
    }
}
