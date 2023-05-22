import java.util.*;

class Stack {
    void push(int arr[], int top, Scanner scanner) {
        if (top == arr.length - 1) 
        {
            
            System.out.println("Stack overflow");
        } 
        else {
            top++;
            System.out.println("Enter the element");
            arr[top] = scanner.nextInt();
        }
    }

    int pop(int arr[], int top) {
        if (top == -1)
         {
             System.out.println(arr.length);
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int ele = arr[top];
            top--;
            return ele;
        }
    }

    void print(int arr[], int top) {
        for (int x = 0; x <= top; x++) {
            System.out.println(arr[x]);
        }
    }
}

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[100];
        int top = -1;
        int ch;
        int choice = 1;
        Stack st = new Stack();

        while (choice == 1) {
            System.out.println("Enter 1 for push\n2 for pop\n3 for printing\n4 for exit");
            ch = scanner.nextInt();

            switch (ch) {
                case 1: {
                    st.push(arr, top, scanner);
                    break;
                }
                case 2: {
                    int ele = st.pop(arr, top);
                    System.out.println(ele);
                    break;
                }
                case 3: {
                    st.print(arr, top);
                    break;
                }
                case 4: {
                    choice = 0;
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                    break;
                }
            }
        }

        scanner.close();
    }
}
