
package com.mycompany.lab11;


public class Node {
	public int value;
	public Node left;
	public Node right;

	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	private boolean find (int val){
		boolean found = false;
		if (this == null )
			return false;
		else{
			if (val == this.value)
				return true;
			else if (val < this.value && this.left != null)
				found = this.left.find(val);
			else if (val > this.value && this.right != null)
				found = this.right.find(val);
		}
		
		return found;
		
	}
	
	
}

