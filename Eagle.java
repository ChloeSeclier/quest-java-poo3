public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff(){
        if (!this.flying && this.altitude == 0){
            this.flying=true;
            System.out.printf("%s take off of!%n", this.getName());
        }
    }

    @Override
    public int ascend(int meters){
        if (this.flying){
            this.altitude=Math.min(this.altitude + meters, 200);
            //%s pour retourner une string, et %d pour un integer et %n pour saut à la ligne
            System.out.printf("%s fly, altitude : %d%n",this.getName(),this.altitude);
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters){
        if (this.flying){
            this.altitude=Math.max(this.altitude - meters, 0);
            //%s pour retourner une string, et %d pour un integer et %n pour saut à la ligne
            System.out.printf("%s glide, altitude : %d%n",this.getName(),this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land(){
        if (this.flying && this.altitude==0){
            System.out.printf("%s is landing.%n", this.getName());
        }
        else{
            System.out.printf("%s is still flying.%n", this.getName());
        }
    }
}
