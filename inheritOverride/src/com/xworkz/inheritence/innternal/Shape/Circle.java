package com.xworkz.inheritence.innternal.Shape;

    class Circle extends Shape {
        public Circle() {
            super();
            System.out.println("Running non-arg constructor Circle--child");
        }

        @Override
        public void draw() {
            System.out.println("Circle draw method--child");
        }

        @Override
        public void getArea() {
            System.out.println("Circle getArea method--child");
        }

        @Override
        public void getPerimeter() {
            System.out.println("Circle getPerimeter method--child");
        }

        @Override
        public void getColor() {
            System.out.println("Circle getColor method--child");
        }

        @Override
        public void getType() {
            System.out.println("Circle getType method--child");
        }
    }


