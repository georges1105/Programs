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
		
		System.out.println(q.front.next.data);
		System.out.println(q.front.next.next.data);
		System.out.println(q.front.next.next.next.data);
		
		
		node itr = q.front;
		
		while(itr.next != q.rear)
		{
			System.out.println(itr.next.data);
			itr.next = itr.next.next;
		}
		
		System.out.println(q.front.next.data);
		System.out.println(q.front.next.next.data);
		System.out.println(q.front.next.next.next.data);
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		

	}

}
