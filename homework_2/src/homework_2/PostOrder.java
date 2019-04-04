package homework_2;

import java.util.Iterator;

public class PostOrder {
	
	public static void postOrder(MyNode v) {
		Iterator it = v.children().iterator();
		while(it.hasNext()) {
			postOrder((MyNode)(it.next()));
		}
		String str= (String)(v.element1());
		int childsum=0;
		if(str.contains("/")==true) {
			for(int i=0; i<v.children().size();i++) {
				MyNode nodeeee= (MyNode)(v.children().get(i));
				childsum += (int)(nodeeee.element2());
				v.setElement2(childsum);
			}
			System.out.println(v.element1()+" = "+ v.element2()+"KB");
		}
	}
	
		
	public static void main(String[] args) {
		
		MyTree tree=new MyTree("cs16/",null);
		MyNode node0=tree.root();
		MyNode node1 = tree.addnode("homeworks/",null);
		MyNode node2 = tree.addnode("programs/",null);
		MyNode node3 = tree.addnode("todo.txt",1);
		MyNode node4 = tree.addChild(node1,"h1c.doc",3);
		MyNode node5 = tree.addChild(node1,"h1nc.doc",2);
		MyNode node6 = tree.addChild(node2,"DDR.java",10);
		MyNode node7 = tree.addChild(node2,"Stocks.java",25);
		MyNode node8 = tree.addChild(node2,"Robot.java",20);
		
		
		postOrder(tree.root());
		
	}

}