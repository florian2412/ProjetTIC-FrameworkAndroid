public class MonMain {

	public static void main(String[] args) {
		View view = new View();
		view.init();
		
		Model model = new Model();
		
		Controller c = new Controller(model, view.getField() , view.getLabel());
		view.getButton().addActionListener(c);
		
		model.addObserver(view.getLabel());
		model.addObserver(view.getLabel2());
		model.addObserver(view.getLabel3());

	}

}
