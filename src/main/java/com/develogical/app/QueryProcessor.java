package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else
        if (query.toLowerCase().contains("softwareengineering")) {
            return "The act of getting software to do what you want it to do. (Edmund George)";
        }
        else
        if (query.toLowerCase().contains("machinelearning")) {
            return "How we create SkyNet (Edmund George)";
        }
        else
        if (query.toLowerCase().contains("ping")) {
            return "pong";
        }
        return "";
    }
}
