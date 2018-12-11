package determination;

public class Stack {

	node tos =new node();
	
	class node
		{
		int data;
		node next;

		node()
		{
			this.data=0;
			this.next=null;
		}
		
		node(int data)
		{
			this.data = data;
			this.next = tos.next;
			}
		}

	void insert(int data)
	{
			node temp = new node(data);
			tos.next = temp;
		}

	void delete()
	{
		if(tos.next!=null)
		{
			int num;
			num = tos.next.data;
			tos.next = tos.next.next;
			System.out.println(num);
		}
		else 
		{
		System.out.println("The stack is empty");	
		}
	}
	
	void printStack(Stack stk1)
	{
		node itr = stk1.tos;
		while(itr.next!=null)
		{
			System.out.println(itr.next.data);
			itr = itr.next;
			}
	}
	
	public static void main(String[] args) {
		Stack stk = new Stack();

		stk.insert(50);
		stk.insert(60);
		stk.insert(70);

		stk.printStack(stk);
		
		stk.delete();
		stk.delete();
		stk.delete();
		stk.delete();
		stk.delete();
		}
	
}

