//����2750 - Bronze2(����, ����)
#include <iostream>
using namespace std;

int main() {
	// �Է�
	int N;
	cin >> N;
	int arr[1000];  //������ ������ �� �ִ� �迭 


	// ����
	//1,2,3 ���� N�� �Է�? -> arr = [3, 2, 1]
	for (int i = 0; i < N; ++i)
		cin >> arr[i];

	//�ٱ�(i): ��ü �� ���� ������?
	//����(j): ������ �� ���� ���ؼ� ū ���� �ڷ� ����
	for (int i = 0; i < N - 1; ++i) {
		for (int j = 0; j < N - i - 1; ++j) {
			// �� ū ���� ���������� '����ó�� �з��� �ö�'(���� ����)
			if (arr[j] > arr[j + 1]) {
				swap(arr[j], arr[j + 1]);
			}
		}
	}

	// ���
	for (int i = 0; i < N; ++i)
		cout << arr[i] << '\n';

	return 0;
}