package chess;

public class Main {

	Model model;
	View view;
	Controller controller;
	
	Main()
	{
		model = new Model();
		view = new View();
		controller = new Controller();
		
		
		model.initialise(view, controller);
		controller.initialise(model, view);
		view.initialise(model, controller);
		
		controller.startup();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main();
	}

}
