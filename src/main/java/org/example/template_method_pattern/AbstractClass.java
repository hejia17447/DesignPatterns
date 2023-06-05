package org.example.template_method_pattern;

public abstract class AbstractClass {

    public void operation() {
        // open
        System.out.println("pre。。。");
        System.out.println("step1");
        System.out.println("step2");
        System.out.println("step3");

        templateMethod();
        // sql ...
        // close
    }

    abstract protected void templateMethod();

}
