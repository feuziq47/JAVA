import java.util.ArrayList;

public class MyTree {
	private MyNode root;
	public int size = 0;
	
	MyTree(){
		root=null;
	}
	MyTree(Object e){
		root=new MyNode(e);
		root.setChildren(new ArrayList());
		size++;
	}
	
	public int size() {
		if(root==null)
			size=0;
		return size;
	}
	
	public MyNode root() {
		return root;
	}
	
	public ArrayList children(MyNode v) {
		return v.children();
	}
	
	public boolean isExternal(MyNode v) {
		if(v.degree()==0)
			return true;
		else return false;
	}
	
	public MyNode addRoot(Object e) {
		if(root==null) {
			root=new MyNode(e);
			root.setChildren(new ArrayList());
			size++;
			return root;
		}else {
			MyNode newRoot=new MyNode(e);
			newRoot.children().add(root);
			root.setParent(newRoot);
			size++;
			return newRoot;
		}
	}
	
	public MyNode addnode(Object e) {
		MyNode newNode = new MyNode(e);
		root.children().add(newNode);
		newNode.setParent(root);
		size++;
		return newNode;
	}
	
	public MyNode addChild(MyNode v, Object e) {
		MyNode newNode= new MyNode(e);
		v.children().add(newNode);
		newNode.setParent(v);
		size++;
		return newNode;
	}
	
	public MyNode addChild(MyNode v, int i, Object e) {
		MyNode newNode= new MyNode(e);
		v.children().add(i,newNode);
		newNode.setParent(v);
		size++;
		return newNode;
	}
	
	public MyNode setChild(MyNode v, int i, Object e) {
		MyNode newNode= new MyNode(e);
		v.children().set(i,newNode);
		return newNode;
	}
	
	public MyNode removeChild(MyNode v, int i) {
		MyNode removeNode=(MyNode)v.children().get(i);
		v.children().remove(i);
		size--;
		return removeNode;
	}
}
