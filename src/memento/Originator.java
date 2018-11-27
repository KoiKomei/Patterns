package memento;

public class Originator {
	private String state;
	
	public void set(String state) {
		this.state=state;
		System.out.println("Originator setting state to " + state);
		
	}
	public Memento saveToMemento() {
		System.out.println("Originator saving to memento");
		return new Memento(this.state);
	}
	
	public void restoreFromMemento(Memento memento) {
		this.state=memento.getSavedState();
		System.out.println("Originator, state after restoring memento: "+state);
	}
	public class Memento {
		private final String state;
		public Memento(String stateToSave) {
			state=stateToSave;
		}
		
		private String getSavedState() {
			return state;
		}
	}
}
