package state;

public class StateContext {
	private State myState;
	StateContext(){
		setState(new StateLowerCase());
	}
	void setState(State newState) {
		myState=newState;
	}
	public void writeName(String name) {
		myState.writeName(this, name);
	}
}
