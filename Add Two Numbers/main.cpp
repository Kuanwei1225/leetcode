/**
You are given two linked lists representing two non-negative numbers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

#include <iostream>
using namespace std;

typedef struct MyNode {
    struct MyNode *next;
    int data;
} Node;

Node* addTwoNumbers(Node *n1, Node *n2)
{
    Node *res, *p1 = n1, *p2 = n2, *ptr = NULL;
    res = new Node;
    int sum = 0;
    for(ptr = res;(p1 != NULL) || (p2 != NULL);) {
        sum /= 10;
        if(p1 != NULL) {
            sum += p1->data;
            p1 = p1->next;
        }
        if(p2 != NULL) {
            sum += p2->data;
            p2 = p2->next;
        }
        ptr->next = new Node;
        ptr = ptr->next;
        ptr->data = sum%10;
    }
    if(sum/10 == 1){
        ptr->next = new Node;
        ptr = ptr->next;
        ptr->data = 1;
    }
    ptr = res->next;
    delete res;
    return ptr;
}

int main()
{
    Node *head1, *head2, *head3, *ptr;
    // create data list
    head1 = new Node;
    ptr = head1;
    ptr->data = 2;
    ptr->next = new Node;
    ptr = ptr->next;
    ptr->data = 4;
    ptr->next = new Node;
    ptr = ptr->next;
    ptr->data = 8;
    ptr->next = NULL;

    head2 = new Node;
    ptr = head2;
    ptr->data = 5;
    ptr->next = new Node;
    ptr = ptr->next;
    ptr->data = 6;
    ptr->next = new Node;
    ptr = ptr->next;
    ptr->data = 4;
    ptr->next = new Node;
    ptr = ptr->next;
    ptr->data = 4;
    ptr->next = NULL;

    head3 = addTwoNumbers(head1, head2);
    // print test
    cout << head3->data << "->";
    cout << head3->next->data << "->";
    cout << head3->next->next->data << "->";
    cout << head3->next->next->next->data << endl;

    return 0;
}
