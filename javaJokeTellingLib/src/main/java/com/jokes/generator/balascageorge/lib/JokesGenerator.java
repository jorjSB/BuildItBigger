package com.jokes.generator.balascageorge.lib;

import java.util.Random;

public class JokesGenerator {

    String[] jokes = {
            "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.",
            "It’s hard to explain puns to kleptomaniacs because they always take things literally.",
            "Time flies like an arrow, fruit flies like a banana.",
            "A soldier survived mustard gas in battle, and then pepper spray by the police. He's now a seasoned veteran.",
            "I hate Russian dolls...so full of themselves.",
            "A Buddhist walks up to a hotdog stand and says, \"Make me one with everything.\"",
            "I'm addicted to brake fluid, but I can stop whenever I want.",
            "What's the difference between my ex and the titanic? The titanic only went down on 1,000 people.",
            "Why is 6 afraid of 7? Because 7 is a registered 6 offender.",
            "Two fish are sitting in a tank. One looks over at the other and says: \"Hey, do you know how to drive this thing?\"",
            "\"This is your captain speaking, AND THIS IS YOUR CAPTAIN SHOUTING.\"",
            "I told my doctor that I broke my arm in two places. He told me to stop going to those places.",
            "Atheism is a non-prophet organization.",
            "What do you call it when Batman skips church? Christian Bale.",
            "What's E.T. short for? Because he's only got little legs."};


    public final String getRandomJoke(){
        int idx = new Random().nextInt(jokes.length);
        return jokes[idx];
    }

}
