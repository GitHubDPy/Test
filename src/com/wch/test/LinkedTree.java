package com.wch.test;



public class LinkedTree implements TreeInterface{

	private Node root;
	
	public LinkedTree(Node root) {
		
		this.root = root;
	}

	@Override
	public void inOrder() {
		
		System.out.print("中序遍历为：");
		inOrder(root);
		
	}
	
	
	//中序遍历
	private void inOrder(Node root) {
		
		//判断节点是否为空
		if(root != null) {
			//输出左子树
			inOrder(root.leftChild);
			
			//输出根节点
			System.out.print(root.value+" ");
			
			//输出右子树
			
			inOrder(root.rightChild);
			
			
		}
	}
	

	@Override
	public void leftOrder() {

	}

	@Override
	public void rightOrder() {

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

//二叉树的节点
class Node{
	
	public Object value;
	
	public Node leftChild;
	
	public Node rightChild;

	public Node(Object value, Node leftChild, Node rightChild) {
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	
	
}
