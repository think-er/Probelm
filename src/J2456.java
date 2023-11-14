import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J2456 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 학생들의 수
        int N = Integer.parseInt(br.readLine());
        int[] a_count = new int[4];
        int[] b_count = new int[4];
        int[] c_count = new int[4];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            count(a_count, Integer.parseInt(st.nextToken()));
            count(b_count, Integer.parseInt(st.nextToken()));
            count(c_count, Integer.parseInt(st.nextToken()));
        }
        // a, b, c의 호감도 총점이 같을 때
        if(a_count[3] == b_count[3] && b_count[3] == c_count[3]) {
            if(a_count[2] > b_count[2]) {
                // a의 3점 횟수가 가장 많을 때
                if(a_count[2] > c_count[2]) {
                    System.out.println(a_count[3]);
                }
                // c의 3점 횟수가 가장 많을 때
                else {
                    System.out.println(c_count[3]);
                }
            }
            else if(a_count[2] == b_count[2]) {
                // 호감도 3점 횟수가 a, b, c 같을 때
                if(b_count[2] == c_count[2]) {
                    // ================================================================================================
                    if(a_count[1] > b_count[1]) {
                        // a의 2점 횟수가 가장 많을 때
                        if(a_count[1] > c_count[1]) {
                            System.out.println(a_count[3]);
                        }
                        // c의 2점 횟수가 가장 많을 때
                        else {
                            System.out.println(c_count[3]);
                        }
                    }
                    else if(a_count[1] == b_count[1]) {
                        // 호감도 2점 횟수가 a, b, c 같을 때
                        if(b_count[1] == c_count[1]) {

                        }
                        // 호감도 3점 횟수가 a == b 이며 c보다 많을 때
                        else if(b_count[1] > c_count[1]) {

                        }
                        // 호감도 2점 횟수가 c가 가장 많을 때
                        else {
                            System.out.println(c_count[3]);
                        }
                    }
                    else {
                        // b의 2점 횟수가 가장 많을 때
                        if(b_count[1] > c_count[1]) {
                            System.out.println(b_count[3]);
                        }
                        // c의 2점 횟수가 가장 많을 때
                        else {
                            System.out.println(c_count[3]);
                        }
                    }



                // ================================================================================================



                }
                // 호감도 3점 횟수가 a == b 이며 c보다 많을 때
                else if(b_count[2] > c_count[2]) {
                    if(a_count[1] > b_count[1])
                }
                // 호감도 3점 횟수가 c가 가장 많을 때
                else {
                    System.out.println(c_count[3]);
                }
            }
            else {
                // b의 3점 횟수가 가장 많을 때
                if(b_count[2] > c_count[2]) {
                    System.out.println(b_count[3]);
                }
                // c의 3점 횟수가 가장 많을 때
                else {
                    System.out.println(c_count[3]);
                }
            }
        }
        else if(a_count[3] == b_count[3]) {

        }
        else if(c_count[3] == b_count[3]) {

        }
    }

    public static void count(int[] arr, int score) {
        if(score == 1) {
            arr[0] += 1;
        }
        else if(score == 2) {
            arr[1] += 1;
        }
        else {
            arr[2] += 1;
        }
        arr[3] += score;
    }
}
