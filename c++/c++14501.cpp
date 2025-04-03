//����14501 - Silver3(���̳��� ���α׷���, �η�Ʈ���� �˰���)
#include <iostream>
#include <vector>

using namespace std;
typedef pair<int, int> ii;

void dpBottomUp(vector<int>& dp, vector<ii> li, int n) {
    //i�Ͽ� ����� ����
    //�� ����� li[i].first�� �ɸ�(��, ����� i+li[i].first�� ����)
    for (int i = 0; i < n; i++) {
        // ������� ������� ����ֱ�(dp[j]�� ����
        for (int j = i + li[i].first; j <= n; j++) {
            //���� dp[i]�� ���� ���� ���� li[i].second�� �� ũ�ٸ� �������ֱ�!
            if (dp[j] < dp[i] + li[i].second) {
                dp[j] = dp[i] + li[i].second;
            }
        }
    }
}

void dpTopDown(vector<int>& dp, vector<ii> li, int n) {
    for (int i = n - 1; i >= 0; i--) {
        // ����� ������� �ѱ��
        if (i + li[i].first > n) {
            dp[i] = dp[i + 1]; // ������� �ʰ� ���� �� ����
        }
        // ����� �ϴ� �Ͱ� ���� �ʴ� �� �� ū ���� ����
        else {
            dp[i] = max(dp[i + 1], li[i].second + dp[i + li[i].first]);
        }
    }
}

int main() {
    //�Է�
    int n;
    cin >> n;

    //li: �� ��¥���� ���ɸ��� �ð��� ������ ����
    //dp: ���� ��ȹ���� �迭(�� ������ ���� �� �ִ� �ִ� ������ ����)
    vector<ii> li; //��㸮��Ʈ (�Ⱓ, �ݾ�)
    vector<int> dp(n + 1, 0); //dp[i] = i�ϱ����� �ִ� �ݾ�

    for (int i = 0; i < n; i++) {
        int a, b;    //a: �ɸ��� �� ��, b: ��� ���� 
        cin >> a >> b;
        li.push_back(make_pair(a, b));
    }

    //����
    dpBottomUp(dp, li, n);

    //���
    cout << dp[n] << "\n";
    return 0;
}