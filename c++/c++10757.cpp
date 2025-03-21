//10757 - ����(����ť��)
#include <iostream>
#include <deque>
#include <string>

using namespace std;

string addBigNumbers(string x, string y) {
    deque<int> d1, d2, result;
    int carry = 0;
    string sumResult = "";

    // ���ڿ��� ���ڷ� ��ȯ�Ͽ� ���� ����
    for (char ch : x) d1.push_back(ch - '0');
    for (char ch : y) d2.push_back(ch - '0');

    // �� ���� �̿��Ͽ� ���� ���� (�ڿ�������)
    while (!d1.empty() || !d2.empty() || carry) {
        int num1 = (d1.empty() ? 0 : d1.back()); // d1�� ������ ����
        int num2 = (d2.empty() ? 0 : d2.back()); // d2�� ������ ����

        if (!d1.empty()) d1.pop_back();
        if (!d2.empty()) d2.pop_back();

        int sum = num1 + num2 + carry;
        carry = sum / 10;
        result.push_front(sum % 10); // �������� ���� (�ڸ� �ø� �ݿ�)
    }

    // ��� ���� ���ڿ��� ��ȯ
    for (int num : result) sumResult += (num + '0');

    return sumResult;
}

int main() {
    string x, y;
    cin >> x >> y;
    cout << addBigNumbers(x, y) << "\n";
    return 0;
}