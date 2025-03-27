//����19941 - �ܹ��� �й� (Silver3/�׸���)
#include <iostream>
#include <string>

using namespace std;

int main() {
    int N, K;
    cin >> N >> K;
    string table;
    cin >> table;

    int count = 0;

    for (int i = 0; i < N; ++i) {
        // ����� ã���� ��
        if (table[i] == 'P') {
            // ���� �������� Ȯ��
            for (int j = max(0, i - K); j <= min(N - 1, i + K); ++j) {
                if (table[j] == 'H') {  // �ܹ��Ÿ� ã����
                    // �ش� �ܹ��Ÿ� ���� ó��
                    table[j] = '.';
                    ++count;  // ���� ��� �� ����
                    break;  // ���� ����� ���� Ž�� ����
                }
            }
        }
    }

    cout << count << endl;
    return 0;
}
