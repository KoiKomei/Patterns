package state;

public class StateLowerCase implements State{

	@Override
	public void writeName(StateContext cont, String name) {
		System.out.println(name.toLowerCase());
		cont.setState(new StateMultipleUpperCase());
	}

}
