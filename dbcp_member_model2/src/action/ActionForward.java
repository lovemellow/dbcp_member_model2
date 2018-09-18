package action;

public class ActionForward {
	private String path;
	private boolean redirect;
	
	public ActionForward() {
		super();		
	}
	
	public ActionForward(String path) {
		super();
		this.path = path;
	}

	public ActionForward(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
}
