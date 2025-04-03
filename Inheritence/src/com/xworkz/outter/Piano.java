package com.xworkz.outter;

    public class Piano extends MusicalInstrument {
        public Piano() {
            super();
            System.out.println("Piano is subclass");
        }

        public void pressKeys() {
            System.out.println("Piano keys pressed");
        }

        public void sustainPedal() {
            System.out.println("Piano sustain pedal used");
        }
    }