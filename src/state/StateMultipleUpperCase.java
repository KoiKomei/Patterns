package state;

public class StateMultipleUpperCase implements State {
	private int count=0;
	@Override
	public void writeName(StateContext cont, String name) {
		System.out.println(name.toUpperCase());
		if(++count>1) {
			cont.setState(new StateLowerCase());
		}
	}

}
