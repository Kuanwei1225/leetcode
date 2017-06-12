/**
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
*/

#include <stdio.h>
#include <stdlib.h>
#define LIST_LEN 5
typedef struct Node {
    int data;
    struct Node *next;
}Node;

Node* removeNthFromEnd(Node* head, int n) {
    int i, count;
    Node *ptr, *rmptr;
    // count
    for(i = 0, ptr = head; ptr->next != NULL; ptr = ptr->next, i++);
    if(i < n)
        return NULL;
    count = i - n - 1;
    for(i = 0, ptr = head; i < count;ptr = ptr->next, i++);
    rmptr = ptr->next;
    ptr->next = rmptr->next;
    free(rmptr);
    return head;


}
void main()
{
    Node *head = NULL, *ptr;
    int i;
    // initial head
    head = (Node*)malloc(sizeof(Node));
    head->data = 1;
    head->next = NULL;
    ptr = head;
    //
    // create list
    for(i = 0; i < LIST_LEN; i++) {
        ptr->next = (Node*)malloc(sizeof(Node));
        ptr = ptr->next;
        ptr->data = i + 2;
        ptr->next = NULL;
    }
    //
    // remove Nth node from end of list
    head = removeNthFromEnd(head, 2);
    //
    // print list
    for(ptr = head; ptr->next != NULL; ptr = ptr->next) {
        printf("%d -> ", ptr->data);
    }
    //
    // release memory
    while(head->next != NULL) {
        ptr = head;
        head = head->next;
        free(ptr);
    }
    free(head);
}
