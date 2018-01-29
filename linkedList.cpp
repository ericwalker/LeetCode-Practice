include <iostream>
using namespace std;

struct List
{
	char *name;
	int age;
	List *next;	
};

List *createList(char *name, int age);
void addANode(List *&ptr, char *name, int age); // need to use reference to change the address of ptr pointer
void deleteList(List *head);
void printfList(List *head);

int main()
{
	List *head = createList("Mike", 18);
	List *ptr = head; // step 1
	addANode(ptr, "Bill", 20);
	addANode(ptr, "Lisa", 15);

	ptr = head;
	printfList(ptr);

	deleteList(head);
	return 0;
}

List *createList(char *name, int age)
{
	List *head = new List;
	if (!head)
	{
		cout << "Memory Allocation Failure" << endl;
		exit(1);
	}

	head->name = name;
	head->age = age;
	head->next = NULL;
	return head;
}

void addANode(List *&ptr, char *name, int age)
{
	List *newNode = new List;
	if (!newNode)
	{
		cout << "Memory Allocation Failure" << endl;
		exit(1);
	}

	newNode->name = name;
	newNode->age = age;
	newNode->next = NULL;

	ptr->next = newNode;
	ptr = ptr->next;
}

void printfList(List *ptr)
{
	while (ptr != NULL)
	{
		cout <<  ptr->name << "\t" << ptr->age << "\n";
		ptr = ptr->next; // ptr point to the next node
	}
}

void deleteList(List *head) // delete from the head node
{
	while (head != NULL)
	{
		List *delPtr = head;
		head = head->next;
		delete delPtr;
	}
}


