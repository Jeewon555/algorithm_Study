//백준2750 - Bronze2(정렬, 구현)
#include <iostream>
using namespace std;

int main() {
	// 입력
	int N;
	cin >> N;
	int arr[1000];  //정수를 저장할 수 있는 배열 


	// 연산
	//1,2,3 으로 N에 입력? -> arr = [3, 2, 1]
	for (int i = 0; i < N; ++i)
		cin >> arr[i];

	//바깥(i): 전체 몇 바퀴 도는지?
	//안쪽(j): 인접한 두 수를 비교해서 큰 수를 뒤로 보냄
	for (int i = 0; i < N - 1; ++i) {
		for (int j = 0; j < N - i - 1; ++j) {
			// 더 큰 수가 오른쪽으로 '버블처런 밀려서 올라감'(버블 정렬)
			if (arr[j] > arr[j + 1]) {
				swap(arr[j], arr[j + 1]);
			}
		}
	}

	// 출력
	for (int i = 0; i < N; ++i)
		cout << arr[i] << '\n';

	return 0;
}