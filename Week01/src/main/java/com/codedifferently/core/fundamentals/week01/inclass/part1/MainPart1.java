package com.codedifferently.core.fundamentals.week01.inclass.part1;

public class MainPart1 {
    public static void main(String[] args ){
        BoringThing boring1 = new BoringThing();
        BoringThing boring2 = new BoringThing();
        BoringThing boring3 = new BoringThing();
        BoringThing boring4 = new BoringThing();
        BoringThing boring5 = new BoringThing();

        ColorfulThing color1 = new ColorfulThing("Pink");
        ColorfulThing color2 = new ColorfulThing("Yellow");
        ColorfulThing color3 = new ColorfulThing();
        ColorfulThing color4 = new ColorfulThing();
        ColorfulThing color5 = new ColorfulThing();

        System.out.println(boring1);
        System.out.println(boring2);
        System.out.println(color1);
        System.out.println(color2);
        System.out.println(color3);

    }
}
