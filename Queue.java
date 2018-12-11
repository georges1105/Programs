package determination;

public class Queue {
	
	node front = new node();
	node rear = new node();
	
	class node {
	
		int data;
		node next;
		
		node()
		{
			this.data = 0;
			this.next = null;
		}
		
		node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
		
	
	void enqueue(int data)
	{
		node temp = new node(data);
		if(front.next == null && rear.next == null)
		{
			front.next = temp;
			rear.next = temp;
		}
		else
		{
			rear.next.next = temp;
			rear.next=temp;
		}
	}
	
	void printqueue(Queue q)
	{
		node itr = new node();
		itr = q.front.next;
		
		while(itr != null)
		{
			System.out.println(itr.data);
			itr = itr.next;
		}
	}
	
	void dequeue()
	{
		if(front.next== null && rear.next == null)
		{
			System.out.println("The Queue is empty");
		}
		else
			if(front.next==rear.next)
			{
				System.out.println(front.next.data);
				front.next=rear.next = null;
			}
			else
				{
				System.out.println(front.next.data);
				front.next=front.next.next;
				}
	}
	
	public static void main(String[] args) {
	
		Queue q = new Queue();
		q.enqueue(50);
		q.enqueue(60);
		q.enqueue(70);
		
		
				
		q.printqueue(q);
						


		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		


	}

}

