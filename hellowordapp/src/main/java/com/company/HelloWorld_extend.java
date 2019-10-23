package com.company;

class HelloWorld_extend {
    public static void main(String[] args) {
        String argument = args[0];
        //String argument = "";
        System.out.println(argument);
        //if (argument==null) { System.out.println("Please write parameter.");}

        //else {
            String[] arrayOfargument = argument.split("=", 2);

            String parameter = arrayOfargument[0].toString();
            String name = arrayOfargument[1];

            if (parameter.equals("--name")) {
                System.out.println("Hello, " + name);
            } else {
                System.out.println("Please rewrite parameter.");
            }
        //}
    }
}