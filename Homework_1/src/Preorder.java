
import java.util.Iterator;

public class Preorder {
	
	public static int getDepth(MyNode node) {
		int depth;
		if(node.parent()==null) {
			depth=0;
		}else {
			depth=1+getDepth(node.parent());
		}
		return depth;
	}
	
	public static void preOrder(MyTree t,MyNode v) {
		for(int i=0;i<getDepth(v);i++) {
			System.out.print(" ");
		}
		System.out.println(v.element());
		Iterator it = v.children().iterator();
		while(it.hasNext()) {
			preOrder(t,(MyNode)(it.next()));
		}
	}
	
	
	public static void main(String[] args) {
		
		MyTree tree=new MyTree("Make Money Fast!");
		MyNode node0=tree.root();
		MyNode node1 = tree.addnode("1. Motivations");
		MyNode node2 = tree.addnode("2. Methods");
		MyNode node3 = tree.addnode("References");
		MyNode node4 = tree.addChild(node1,"1.1 Greed");
		MyNode node5 = tree.addChild(node1,"1.2 Avidity");
		MyNode node6 = tree.addChild(node2,"2.1 Stock Fraud");
		MyNode node7 = tree.addChild(node2,"2.2 Ponzi Scheme");
		MyNode node8 = tree.addChild(node2,"2.3 Bank Robbery");
		
		
		preOrder(tree,tree.root());
		
	}

}
