package mediator;

public class PartecipantMeditor implements Mediator {

	BtnView btnView;
    BtnSearch btnSearch;
    BtnBook btnBook;
    LblDisplay show;
	
	@Override
	public void book() {
		btnBook.setEnabled(false);
		btnView.setEnabled(true);
		btnSearch.setEnabled(true);
	    show.setText("booking...");
	}

	@Override
	public void view() {
		btnBook.setEnabled(true);
		btnView.setEnabled(false);
		btnSearch.setEnabled(true);
	    show.setText("viewing....");
		
		
	}

	@Override
	public void search() {
		btnBook.setEnabled(true);
		btnView.setEnabled(true);
		btnSearch.setEnabled(false);
	    show.setText("searching...");
		
	}

	@Override
	public void registerView(BtnView v) {
		btnView=v;
		
	}

	@Override
	public void registerSearch(BtnSearch s) {
		btnSearch=s;
		
	}

	@Override
	public void registerBook(BtnBook b) {
		btnBook = b;
		
	}

	@Override
	public void registerDisplay(LblDisplay d) {
		show=d;
	}

}
