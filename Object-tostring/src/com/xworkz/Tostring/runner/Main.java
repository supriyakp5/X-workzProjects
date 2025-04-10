package com.xworkz.Tostring.runner;

import com.xworkz.Tostring.internal.*;


public class Main {
    public static void main(String[] args) {

        AirConditioner ac = new AirConditioner("ArcticBreeze", 2205, 1.75);
        System.out.println(ac);
        System.out.println(ac.hashCode());
        System.out.println("original:"+System.identityHashCode(ac));
        System.out.println("____________________________________________");

        Bag backpack = new Bag("SkyTrek", 30, 49.99);
        System.out.println(backpack);
        System.out.println(backpack.hashCode());
        System.out.println("original:"+System.identityHashCode(backpack));
        System.out.println("____________________________________________");

        Bathtub tub = new Bathtub("Acrylic", 170, 18.5);
        System.out.println(tub);
        System.out.println(tub.hashCode());
        System.out.println("original:"+System.identityHashCode(tub));
        System.out.println("____________________________________________");


        Bed myBed = new Bed("Queen", 45, 299.99);
        System.out.println(myBed);
        System.out.println(myBed.hashCode());
        System.out.println("original:"+System.identityHashCode(myBed));
        System.out.println("____________________________________________");

        Bicycle bike = new Bicycle("Mountain", 21, 13.7);
        System.out.println(bike);
        System.out.println(bike.hashCode());
        System.out.println("original:"+System.identityHashCode(bike));
        System.out.println("____________________________________________");


        Blanket cozyBlanket = new Blanket("Fleece", 8, 2.1);
        System.out.println(cozyBlanket);
        System.out.println(cozyBlanket.hashCode());
        System.out.println("original:"+System.identityHashCode(cozyBlanket));
        System.out.println("____________________________________________");

        Blender kitchenBlender = new Blender("NutriMix", 5, 1.5);
        System.out.println(kitchenBlender);
        System.out.println(kitchenBlender.hashCode());
        System.out.println("original:"+System.identityHashCode(kitchenBlender));
        System.out.println("____________________________________________");

        Book myBook = new Book("The Time Keeper", 240, 15.99);
        System.out.println(myBook);
        System.out.println(myBook.hashCode());
        System.out.println("original:"+System.identityHashCode(myBook));
        System.out.println("____________________________________________");

        Bottle waterBottle = new Bottle("Stainless Steel", 750, 25.4);
        System.out.println(waterBottle);
        System.out.println(waterBottle.hashCode());
        System.out.println("original:"+System.identityHashCode(waterBottle));
        System.out.println("____________________________________________");

        Bowl ceramicBowl = new Bowl("Blue", 18, 7.5);
        System.out.println(ceramicBowl);
        System.out.println(ceramicBowl.hashCode());
        System.out.println("original:"+System.identityHashCode(ceramicBowl));
        System.out.println("____________________________________________");

        Box storageBox = new Box("Cardboard", 40, 1.2);
        System.out.println(storageBox);
        System.out.println(storageBox.hashCode());
        System.out.println("original:"+System.identityHashCode(storageBox));
        System.out.println("____________________________________________");

        Brush paintBrush = new Brush("Round", 200, 15.5);
        System.out.println(paintBrush);
        System.out.println(paintBrush.hashCode());
        System.out.println("original:"+System.identityHashCode(paintBrush));
        System.out.println("____________________________________________");

        BrushHolder holder = new BrushHolder("Plastic", 5, 12.0);
        System.out.println(holder);
        System.out.println(holder.hashCode());
        System.out.println("original:"+System.identityHashCode(holder));
        System.out.println("____________________________________________");

        Bucket metalBucket = new Bucket("Silver", 10, 28.5);
        System.out.println(metalBucket);
        System.out.println(metalBucket.hashCode());
        System.out.println("original:"+System.identityHashCode(metalBucket));
        System.out.println("____________________________________________");

        Cable usbCable = new Cable("USB-C", 2, 3.5);
        System.out.println(usbCable);
        System.out.println(usbCable.hashCode());
        System.out.println("original:"+System.identityHashCode(usbCable));
        System.out.println("____________________________________________");

        Calculator sciCalc = new Calculator("Casio FX-991EX", 552, 2.3);
        System.out.println(sciCalc);
        System.out.println(sciCalc.hashCode());
        System.out.println("original:"+System.identityHashCode(sciCalc));
        System.out.println("____________________________________________");

        Camera myCamera = new Camera("Canon", 24, 4.0);
        System.out.println(myCamera);
        System.out.println(myCamera.hashCode());
        System.out.println("original:"+System.identityHashCode(myCamera));
        System.out.println("____________________________________________");

        Can sodaCan = new Can("Cola", 330, 6.5);
        System.out.println(sodaCan);
        System.out.println(sodaCan.hashCode());
        System.out.println("original:"+System.identityHashCode(sodaCan));
        System.out.println("____________________________________________");


        Car myCar = new Car("Toyota Corolla", 2022, 1.8);
        System.out.println(myCar);
        System.out.println(myCar.hashCode());
        System.out.println("original:"+System.identityHashCode(myCar));
        System.out.println("____________________________________________");

        Carpet livingRoomCarpet = new Carpet("Wool", 250, 89.99);
        System.out.println(livingRoomCarpet);
        System.out.println(livingRoomCarpet.hashCode());
        System.out.println("original:"+System.identityHashCode(livingRoomCarpet));
        System.out.println("____________________________________________");

        Chair diningChair = new Chair("Wooden", 4, 90.5);
        System.out.println(diningChair);
        System.out.println(diningChair.hashCode());
        System.out.println("original:"+System.identityHashCode(diningChair));
        System.out.println("____________________________________________");

        Clip paperClip = new Clip("Metal", 100, 3.2);
        System.out.println(paperClip);
        System.out.println(paperClip.hashCode());
        System.out.println("original:"+System.identityHashCode(paperClip));
        System.out.println("____________________________________________");


        Clock wallClock = new Clock("Seiko", 12, 30.0);
        System.out.println(wallClock);
        System.out.println(wallClock.hashCode());
        System.out.println("original:"+System.identityHashCode(wallClock));
        System.out.println("____________________________________________");

        ClockRadio myRadio = new ClockRadio("Philips", 2, 108.0);
        System.out.println(myRadio);
        System.out.println(myRadio.hashCode());
        System.out.println("original:"+System.identityHashCode(myRadio));
        System.out.println("____________________________________________");

        Closet bedroomCloset = new Closet("Plywood", 5, 210.0);
        System.out.println(bedroomCloset);
        System.out.println(bedroomCloset.hashCode());
        System.out.println("original:"+System.identityHashCode(bedroomCloset));
        System.out.println("____________________________________________");

        CoffeeMaker maker = new CoffeeMaker("Nespresso", 4, 1500.0);
        System.out.println(maker);
        System.out.println(maker.hashCode());
        System.out.println("original:"+System.identityHashCode(maker));
        System.out.println("____________________________________________");

        Comb hairComb = new Comb("Plastic", 24, 15.0);
        System.out.println(hairComb);
        System.out.println(hairComb.hashCode());
        System.out.println("original:"+System.identityHashCode(hairComb));
        System.out.println("____________________________________________");

        Couch livingRoomCouch = new Couch("Linen", 3, 220.5);
        System.out.println(livingRoomCouch);
        System.out.println(livingRoomCouch.hashCode());
        System.out.println("original:"+System.identityHashCode(livingRoomCouch));
        System.out.println("____________________________________________");

        Cup teaCup = new Cup("Ceramic", 250, 8.0);
        System.out.println(teaCup);
        System.out.println(teaCup.hashCode());
        System.out.println("original:"+System.identityHashCode(teaCup));
        System.out.println("____________________________________________");

        Curtain windowCurtain = new Curtain("Silk", 240, 49.99);
        System.out.println(windowCurtain);
        System.out.println(windowCurtain.hashCode());
        System.out.println("original:"+System.identityHashCode(windowCurtain));
        System.out.println("____________________________________________");

        DeepFreezer freezer = new DeepFreezer("Whirlpool", 300, 1.2);
        System.out.println(freezer);
        System.out.println(freezer.hashCode());
        System.out.println("original:"+System.identityHashCode(freezer));
        System.out.println("____________________________________________");

        Door woodenDoor = new Door("Wood", 210, 90.0);
        System.out.println(woodenDoor);
        System.out.println(woodenDoor.hashCode());
        System.out.println("original:"+System.identityHashCode(woodenDoor));
        System.out.println("____________________________________________");

        Drawer drawer = new Drawer("Wood", 4, 35.5);
        System.out.println(drawer);
        System.out.println(drawer.hashCode());
        System.out.println("original:"+System.identityHashCode(drawer));
        System.out.println("____________________________________________");

        Drill drill = new Drill("Bosch", 750, 2.5);
        System.out.println(drill);
        System.out.println(drill.hashCode());
        System.out.println("original:"+System.identityHashCode(drill));
        System.out.println("____________________________________________");

        Drone drone = new Drone("Phantom 4", 30, 7.0);
        System.out.println(drone);
        System.out.println(drone.hashCode());
        System.out.println("original:"+System.identityHashCode(drone));
        System.out.println("____________________________________________");

        Fan fan = new Fan("Havells", 5, 75.5);
        System.out.println(fan);
        System.out.println(fan.hashCode());
        System.out.println("original:"+System.identityHashCode(fan));
        System.out.println("____________________________________________");

        FanHeater heater = new FanHeater("ThermoJet X2", 3, 1500.0);
        System.out.println(heater);
        System.out.println(heater.hashCode());
        System.out.println("original:"+System.identityHashCode(heater));
        System.out.println("____________________________________________");

        Folder folder = new Folder("Project Docs", 120, 2.5);
        System.out.println(folder);
        System.out.println(folder.hashCode());
        System.out.println("original:"+System.identityHashCode(folder));
        System.out.println("____________________________________________");


        Frame frame = new Frame("Wood", 40, 30.5);
        System.out.println(frame);
        System.out.println(frame.hashCode());
        System.out.println("original:"+System.identityHashCode(frame));
        System.out.println("____________________________________________");

        Fridge fridge = new Fridge("Samsung", 300, 4.0);
        System.out.println(fridge);
        System.out.println(fridge.hashCode());
        System.out.println("original:"+System.identityHashCode(fridge));
        System.out.println("____________________________________________");

        Glove glove = new Glove("Leather", 9, 29.99);
        System.out.println(glove);
        System.out.println(glove.hashCode());
        System.out.println("original:"+System.identityHashCode(glove));
        System.out.println("____________________________________________");

        Grinder grinder = new Grinder("Bosch", 750, 129.50);
        System.out.println(grinder);
        System.out.println(grinder.hashCode());
        System.out.println("original:"+System.identityHashCode(grinder));
        System.out.println("____________________________________________");

        Hammer hammer = new Hammer("Claw", 16, 19.99);
        System.out.println(hammer);
        System.out.println(hammer.hashCode());
        System.out.println("original:"+System.identityHashCode(hammer));
        System.out.println("____________________________________________");

        Hat hat = new Hat("Fedora", 7, 29.99);
        System.out.println(hat);
        System.out.println(hat.hashCode());
        System.out.println("original:"+System.identityHashCode(hat));
        System.out.println("____________________________________________");

        Helmet helmet = new Helmet("Motorcycle", 58, 89.99);
        System.out.println(helmet);
        System.out.println(helmet.hashCode());
        System.out.println("original:"+System.identityHashCode(helmet));
        System.out.println("____________________________________________");

        Jacket jacket = new Jacket("NorthFace", 42, 129.99);
        System.out.println(jacket);
        System.out.println(jacket.hashCode());
        System.out.println("original:"+System.identityHashCode(jacket));
        System.out.println("____________________________________________");

        Juicer juicer = new Juicer("Breville", 5012, 149.95);
        System.out.println(juicer);
        System.out.println(juicer.hashCode());
        System.out.println("original:"+System.identityHashCode(juicer));
        System.out.println("____________________________________________");


        Keyboard keyboard = new Keyboard("Logitech", 104, 89.99);
        System.out.println(keyboard);
        System.out.println(keyboard.hashCode());
        System.out.println("original:"+System.identityHashCode(keyboard));
        System.out.println("____________________________________________");


        Lamp lamp = new Lamp("Desk Lamp", 60, 24.99);
        System.out.println(lamp);
        System.out.println(lamp.hashCode());
        System.out.println("original:"+System.identityHashCode(lamp));
        System.out.println("____________________________________________");

        Laptop laptop = new Laptop("Lenovo", 16, 999.99);
        System.out.println(laptop);
        System.out.println(laptop.hashCode());
        System.out.println("original:"+System.identityHashCode(laptop));
        System.out.println("____________________________________________");

        Light light = new Light("Ceiling Light", 101, 59.99);
        System.out.println(light);
        System.out.println(light.hashCode());
        System.out.println("original:"+System.identityHashCode(light));
        System.out.println("____________________________________________");

        Mat mat = new Mat("Yoga Mat", 202, 29.99);
        System.out.println(mat);
        System.out.println(mat.hashCode());
        System.out.println("original:"+System.identityHashCode(mat));
        System.out.println("____________________________________________");

        Mirror mirror = new Mirror("Wall Mirror", 303, 45.50);
        System.out.println(mirror);
        System.out.println(mirror.hashCode());
        System.out.println("original:"+System.identityHashCode(mirror));
        System.out.println("____________________________________________");

        Monitor monitor = new Monitor("Dell 24\"", 505, 159.99);
        System.out.println(monitor);
        System.out.println(monitor.hashCode());
        System.out.println("original:"+System.identityHashCode(monitor));
        System.out.println("____________________________________________");

        Mouse mouse = new Mouse("Logitech M330", 506, 29.99);
        System.out.println(mouse);
        System.out.println(mouse.hashCode());
        System.out.println("original:"+System.identityHashCode(mouse));
        System.out.println("____________________________________________");

        Mug mug = new Mug("Ceramic Coffee Mug", 507, 12.49);
        System.out.println(mug);
        System.out.println(mug.hashCode());
        System.out.println("original:"+System.identityHashCode(mug));
        System.out.println("____________________________________________");

        Notebook notebook = new Notebook("Spiral Notebook", 612, 4.25);
        System.out.println(notebook);
        System.out.println(notebook.hashCode());
        System.out.println("original:"+System.identityHashCode(notebook));
        System.out.println("____________________________________________");


        Oven oven = new Oven("Convection Oven", 713, 299.99);
        System.out.println(oven);
        System.out.println(oven.hashCode());
        System.out.println("original:"+System.identityHashCode(oven));
        System.out.println("____________________________________________");


        Pen pen = new Pen("Fountain Pen", 821, 15.75);
        System.out.println(pen);
        System.out.println(pen.hashCode());
        System.out.println("original:"+System.identityHashCode(pen));
        System.out.println("____________________________________________");

        Pencil pencil = new Pencil("Graphite Pencil", 902, 1.25);
        System.out.println(pencil);
        System.out.println(pencil.hashCode());
        System.out.println("original:"+System.identityHashCode(pencil));
        System.out.println("____________________________________________");

        Phone phone = new Phone("Smartphone", 1001, 699.99);
        System.out.println(phone);
        System.out.println(phone.hashCode());
        System.out.println("original:"+System.identityHashCode(phone));
        System.out.println("____________________________________________");

        PhoneCase phoneCase = new PhoneCase("Silicone Case", 302, 19.99);
        System.out.println(phoneCase);
        System.out.println(phoneCase.hashCode());
        System.out.println("original:"+System.identityHashCode(phoneCase));
        System.out.println("____________________________________________");

        Pillow pillow = new Pillow("Memory Foam Pillow", 303, 25.50);
        System.out.println(pillow);
        System.out.println(pillow.hashCode());
        System.out.println("original:"+System.identityHashCode(pillow));
        System.out.println("____________________________________________");

        Plate plate = new Plate("Ceramic Dinner Plate", 404, 8.75);
        System.out.println(plate);
        System.out.println(plate.hashCode());
        System.out.println("original:"+System.identityHashCode(plate));
        System.out.println("____________________________________________");

        Plier plier = new Plier("Needle Nose Plier", 405, 12.99);
        System.out.println(plier);
        System.out.println(plier.hashCode());
        System.out.println("original:"+System.identityHashCode(plier));
        System.out.println("____________________________________________");

        Printer printer = new Printer("LaserJet Pro", 406, 249.99);
        System.out.println(printer);
        System.out.println(printer.hashCode());
        System.out.println("original:"+System.identityHashCode(printer));
        System.out.println("____________________________________________");

        Projector projector = new Projector("Epson X120", 407, 599.95);
        System.out.println(projector);
        System.out.println(projector.hashCode());
        System.out.println("original:"+System.identityHashCode(projector));
        System.out.println("____________________________________________");

        RiceCooker cooker = new RiceCooker("Panasonic SR-ZE105", 502, 129.99);
        System.out.println(cooker);
        System.out.println(cooker.hashCode());
        System.out.println("original:"+System.identityHashCode(cooker));
        System.out.println("____________________________________________");


        System.out.println(new TV("TVName", 23, 10.0));


        System.out.println(new Router("RouterName", 28, 10.0));

        System.out.println(new Window("WindowName", 1, 10.0));

        System.out.println(new Ruler("RulerName", 1, 10.0));

        System.out.println(new Stapler("StaplerName", 1, 10.0));

        System.out.println(new Sofa("SofaName", 1, 10.0));

        System.out.println(new Vase("VaseName", 1, 10.0));

        System.out.println(new Tray("TrayName", 1, 10.0));

        System.out.println(new Saw("SawName", 1, 10.0));

        System.out.println(new Screwdriver("ScrewdriverName", 1, 10.0));
        System.out.println(new Wrench("WrenchName", 1, 10.0));

        System.out.println(new Tablet("TabletName", 1, 10.0));

        System.out.println(new Robot("RobotName", 1, 10.0));

        System.out.println(new Scooter("ScooterName", 1, 10.0));
        System.out.println(new Skateboard("SkateboardName", 1, 10.0));

        System.out.println(new Rug("RugName", 1, 10.0));
        System.out.println(new TVStand("TVStandName", 1, 10.0));

        System.out.println(new Sink("SinkName", 1, 10.0));

        System.out.println(new Toilet("ToiletName", 1, 10.0));

        System.out.println(new SoapDispenser("SoapDispenserName", 1, 10.0));
        System.out.println(new Towel("TowelName", 1, 10.0));


        System.out.println(new RiceCooker("RiceCookerName", 1, 10.0));

        System.out.println(new WaterHeater("WaterHeaterName", 1, 10.0));
    }
}
