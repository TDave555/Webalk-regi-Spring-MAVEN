package hu.me.iit.webalk.fourth.Impl;

public class VillanyMotor implements hu.me.iit.webalk.fourth.Motor {

	private final int teljesitmeny;
    private final int feszultseg;

    public VillanyMotor(int teljesitmeny, int feszultseg) {
        this.teljesitmeny = teljesitmeny;
        this.feszultseg = feszultseg;
    }

    @Override
    public String toString() {
        return String.format("Villanymotor teljesítménye: "+ teljesitmeny +" feszültsége: "+ feszultseg);
    }
	
}
