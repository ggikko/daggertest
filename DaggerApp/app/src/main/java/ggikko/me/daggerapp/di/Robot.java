package ggikko.me.daggerapp.di;

import ggikko.me.daggerapp.di.behavior.Circle;
import ggikko.me.daggerapp.di.behavior.Rectangle;
import ggikko.me.daggerapp.di.behavior.Shape;

/**
 * Created by admin on 16. 5. 24..
 */
public class Robot {

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();

        Shape shape1 = new Rectangle();
        shape1.draw();
    }
}
