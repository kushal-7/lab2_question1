public class lab{
	Stack top;
	Stack size;

	public void push(int e){
		Stack newest= new Stack(e,null);

		if(size==0){
			top=newest;
		
		}
		else{
			newest.setNext(top);
		}
		size=size+1;
	}
	public void pop(){
		int removedelement= top.getElement();
		if (size==0){
			return 0;
		}
		else{
			top=top.getNext();
			size=size-1;
		}
		return removedelement;

	}
	public int top(){
		if (size==0){
			return 0;
		}
		else{
			return top.getElement();
		}

	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(size==0){
			return true;
		}
		else{
			return false;
		}
	}
}

class Stack{
	private int element;
	private Stack next;

	public Stack(int element, Stack next){
		this.element=element;
		this.next=next;
	}

	public int getElement(){
		return element;
	}
	public Stack getNext(){
		return next;
	}
	public void setElement(int n){
		element=n;
	}
	public void setNext(Stack n){
		next=n;
	}

}