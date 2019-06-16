package application;

public class Model {


	String _testtitle, _id, _firstName, _lastName; //DataBase attributes

	public Model(String _testtitle, String _id, String _firstName, String _lastName) {
		super();
		this._testtitle = _testtitle;
		this._id = _id;
		this._firstName = _firstName;
		this._lastName = _lastName;
	}

	public String get_testtitle() {
		return _testtitle;
	}

	public void set_testtitle(String _testtitle) {
		this._testtitle = _testtitle;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String get_firstName() {
		return _firstName;
	}

	public void set_firstName(String _firstName) {
		this._firstName = _firstName;
	}

	public String get_lastName() {
		return _lastName;
	}

	public void set_lastName(String _lastName) {
		this._lastName = _lastName;
	}


}
