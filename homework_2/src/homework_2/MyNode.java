package homework_2;
import java.util.ArrayList;

public class MyNode {
	private Object element1;
	private Object element2;
	private MyNode parent;
	private ArrayList children;
	
	MyNode(){
		element1=null;
		element2=null;
		parent=null;
		children=null;
	}
	MyNode(Object e1, Object e2){
		element1=e1;
		element2=e2;
		parent=null;
		children=new ArrayList();
	}
	
	public Object element1() {
		return element1;
	}
	
	public Object element2() {
		return element2;
	}
	
	public MyNode parent() {
		return parent;
	}
	
	public ArrayList children() {
		return children;
	}
	
	public void setElement1(Object e) {
		this.element1=e;
	}

	public void setElement2(Object e) {
		this.element2=e;
	}
	
	public void setParent(MyNode p) {
		this.parent=p;
	}
	
	public void setChildren(ArrayList c) {
		this.children=c;
	}
	
	public int degree() {
		int d;
		d=children.size();
		return d;
	}
	
	
	
}