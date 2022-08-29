package algorithem.DoitAlgorithm_java.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1377_버블소트1 {

    public static class mData implements Comparable<mData> {
        int index;
        int value;

        public mData(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(mData o) {
            return this.value - o.value; // value 기준 오름차순 정렬하기
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        mData[] A = new mData[N];
        for(int i=0; i<N; i++) {
            A[i] = new mData(i, Integer.parseInt(br.readLine()));
        }
        Arrays.sort(A);
        int max = 0;
        for(int i=0; i<N; i++) {
            if(max < A[i].index - i) { // 정렬 전 index - 정렬 후 index 계산의 최댓값 저장하기
                max = A[i].index - i;
            }
        }
        System.out.println(max + 1);
    }
}
