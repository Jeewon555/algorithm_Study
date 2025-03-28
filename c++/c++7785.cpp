//백준7785 - Silver5(집합과 맵, 자료구조)
#include <iostream>
#include <set>
using namespace std;

//set을 이용하여 출퇴근 하는 사람들을 관리
int main()
{   
	//입력
	int n;
	string input, state; //input: 사람이름, state: enter 또는 leave
	set<string> s; //사무실에 있는 사람들 저장할 set(중복없이, 자동정렬)
	 
	cin >> n;

	//연산
	while (n--) {
		cin >> input >> state; 
		
		if (state == "enter") { // 출근: set에 추가
			s.insert(input);
		}else { 
			s.erase(input);  // 퇴근: set에서 제거
		}
	}

	// 출력
	//rebegin() ~ rend(): 사전 역순 출력 
	for (auto iter = s.rbegin(); iter != s.rend(); iter++) { // 이름을 사전 순의 역순으로 
		cout << *iter << '\n'; //*iter: 해당 사람 이름 출력
	}
	return 0;
}


/*
Point!!
1) set : 중복 제거 + 정렬이 자동 
2) rebegin() ~ rend(): 사전 역순 출력
3) *iter: 그 위치에 있는 실제 값을 가져옴
*/