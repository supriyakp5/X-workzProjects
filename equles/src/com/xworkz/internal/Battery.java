package com.xworkz.internal;

public class Battery {
    private String power;
    private double texture;

    public Battery(int flexibility, String power, double texture) {
     /*public Battery(int flexibility, String power, double texture) {
         this.flexibility = flexibility;
         this.power = power;
         this.texture = texture;
     }
     }*/

        @Override
        public String toString () {
            @ @ -19, 4 + 19, 38 @@public String toString () {
                public int hashCode () {
                    return 800;
                }
                public void getflexibility ( int flexibility){
                    this.flexibility = flexibility;
                }
                public void setflexibility ( int flexibility){
                    this.flexibility = flexibility;
                }
                public void getpower (String power){
                    this.power = power;
                }
                public void setpower (String power){
                    this.power = power;
                }
                public void gettexture ( int texture){
                    this.texture = texture;
                }
                public void settexture ( int texture){
                    this.texture = texture;
                }
                @Override
                public boolean equals (Object obj){
                    if (obj != null) {
                        System.out.println("Refer is not null");
                        if (obj instanceof Battery) {
                            System.out.println("Ref is battery,it will compare....");
                            Battery battery = this;
                            Battery battery1 = (Battery) obj;
                            if (battery.power.equals(battery1.power)) {
                                System.out.println("Both battery are same");
                                return true;
                            }
                        }
                    }
                    return false;
                }
            }
        }
    }
}
