package com.zisal.challenge1;

public class Challenge {
    public static void main(String[] args) {
        //
        // 1. Change car engine
        //
        Car car = new Car();
        Engine v6Engine = new V6Engine();
        car.changeEngine(v6Engine);

        // PROBLEM
        double v6EngineSpeed = car.getMaxSpeed();
        System.out.println("1.1 : " + (v6EngineSpeed == v6Engine.getMaxSpeed()));

        Engine turbopropEngine = new TurbopropEngine();
        car.changeEngine(turbopropEngine);
        double turbopropEngineSpeed = car.getMaxSpeed();

        // PROBLEM
        System.out.println("1.2 : " + (turbopropEngineSpeed > v6EngineSpeed));
        
        //
        // 2. Custom HTML-like markup language
        //
        MarkupElement root = new RootElement("[customml]", "[/customml]");
        MarkupElement body = new BodyElement("[body]", "[/body]");
        MarkupElement italic = new ItalicElement("[i]", "[/i]");

        italic.setContent("I am italic.");
        
        // PROBLEM
        System.out.println("2.1 : " + italic.produceOutput()
                .equals("[i]I am italic.[/i]"));        
        root.addChildren(body);
        body.addChildren(italic);
        
        System.out.println("2.2 : " + root.produceOutput()
                .equals("[customml][body][i]I am italic.[/i][/body][/customml]"));
        
        
        //
        // 3. Implement stack that will output n items at once
        //
        WeirdStack<Integer> weirdStack = new WeirdStack<Integer>(2); // will output 2 items at once.
        weirdStack.push(1);
        weirdStack.push(2);
        weirdStack.push(3);
        
        java.util.List<Integer> popped = weirdStack.pop();
        // PROBLEM: Verify that popped is [3, 2]
        System.out.println("3.1 : " + popped.equals(java.util.Arrays.asList(3, 2)));        
        
        weirdStack.setPopSize(3); // will output 3 items at once.
        weirdStack.push(4);
        weirdStack.push(5);
        
        java.util.List<Integer> poppedAgain = weirdStack.pop();
        // PROBLEM: Verify that poppedAgain is [5, 4, 1]
        System.out.println("3.2 : " + poppedAgain.equals(java.util.Arrays.asList(5, 4, 1)));
    }
}