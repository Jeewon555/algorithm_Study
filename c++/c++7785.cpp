//����7785 - Silver5(���հ� ��, �ڷᱸ��)
#include <iostream>
#include <set>
using namespace std;

//set�� �̿��Ͽ� ����� �ϴ� ������� ����
int main()
{   
	//�Է�
	int n;
	string input, state; //input: ����̸�, state: enter �Ǵ� leave
	set<string> s; //�繫�ǿ� �ִ� ����� ������ set(�ߺ�����, �ڵ�����)
	 
	cin >> n;

	//����
	while (n--) {
		cin >> input >> state; 
		
		if (state == "enter") { // ���: set�� �߰�
			s.insert(input);
		}else { 
			s.erase(input);  // ���: set���� ����
		}
	}

	// ���
	//rebegin() ~ rend(): ���� ���� ��� 
	for (auto iter = s.rbegin(); iter != s.rend(); iter++) { // �̸��� ���� ���� �������� 
		cout << *iter << '\n'; //*iter: �ش� ��� �̸� ���
	}
	return 0;
}


/*
Point!!
1) set : �ߺ� ���� + ������ �ڵ� 
2) rebegin() ~ rend(): ���� ���� ���
3) *iter: �� ��ġ�� �ִ� ���� ���� ������
*/