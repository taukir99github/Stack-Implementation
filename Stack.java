package helloworld;

import java.util.Scanner;

class StackOperation {
	final int size = 7;
	int top = -1;
	int a[] = new int[size];

	public void push() {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		x = sc.nextInt();
		if (size == top - 1) {
			System.out.println("Stack Overflow");
		} else {
			top++;
			a[top] = x;
			System.out.println("Data is inserted: ");

		}

	}

	public void pop() {
		int item = 0;
		if (top == -1) {
			System.out.println("Stack underflow");
		} else {
			item = a[top];
			top--;
		}
		System.out.println("Data is poped!!!" + " " + item);
	}

	public void ReverseList() {
		if (top == -1) {
			System.out.println("List is Empty!!!");
		} else {
			for (int i = top; i >= 0; i--) {
				System.out.println(a[i]);
			}
		}
	}

	public void SearchElement() {
		Scanner sc = new Scanner(System.in);
		int x, flag = 0;
		System.out.println("Enter the data want to search");
		x = sc.nextInt();
		if (top == -1) {
			System.out.println("List is empty");
		} else {

			for (int i = 0; i <= top; i++) {
				if (a[i] == x) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("NOT FOUND");
			} else {
				System.out.println(" FOUND");

			}
		}
	}

	public void GetLength() {
		int length = 0;
		if (top == -1) {
			System.out.println("List is Empty: ");
		} else {
			for (int i = 0; i <= top; i++) {
				length++;
			}
			System.out.println("Length of stack is " + " " + length);
		}
	}

	public void GetMiddleElement() {

		int high = a[top];
		int low = a[0];
		int mid = 0;
		if (top == -1)

		{
			System.out.println("List is Empty: ");
		} else {
			mid = (high + low) / 2;

		}
		System.out.println("Middle element is " + " " + mid);

	}

	public void display() {
		if (top == -1) {
			System.out.println("Stack is Empty!!!");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.println(a[i]);
			}

		}

	}
}

public class Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackOperation s = new StackOperation();
		int choice;
		while (true) {
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.Display");
			System.out.println("4.Reverse list");
			System.out.println("5.SearchElement");
			System.out.println("6.GetMiddleElement");
			System.out.println("Enter your choice: ");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				s.push();
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.display();
				break;
			case 4:
				s.ReverseList();
				break;
			case 5:
				s.SearchElement();
				break;
			case 6:
				s.GetMiddleElement();
				break;

			}
		}
	}
}
