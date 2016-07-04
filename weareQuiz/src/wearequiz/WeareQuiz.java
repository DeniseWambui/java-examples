/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wearequiz;

/**
 *
 * @author Desktop
 */
public class WeareQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        letterSolver();
    }

    public static void letterSolver() {
        for (int w = 0; w < 10; w++) {
            for (int e = 0; e < 10; e++) {
                for (int a = 0; a < 10; a++) {
                    for (int r = 0; r < 10; r++) {
                        //weare variable                         
                        int weare = (w * 10000) + (e * 1000) + (a * 100) + (r * 10) + e;
                        for (int p = 0; p < 10; p++) {
                            for (int n = 0; n < 10; n++) {
                                //penn var
                                int penn = (p * 1000) + (e * 100) + (n * 10) + n;
                                for (int s = 0; s < 10; s++) {
                                    for (int t = 0; t < 10; t++) {
                                        //state var
                                        int state = (s * 10000) + (t * 1000) + (a * 100) + (t * 10) + e;
                                        for (int h = 0; h < 10; h++) {
                                            for (int y = 0; y < 10; y++) {
                                                //happy var
                                                int happy = (h * 10000) + (a * 1000) + (p * 100) + (p * 10) + y;
                                                //if weare penn state is equal to happy
                                                if ((weare + penn + state == happy) && (weare > 10000) && (penn > 1000) && (state > 10000) && (happy > 10000)) {
                                                    System.out.println("{W:" + w + " E:" + e + " A:" + a + " R:" + r + "}");
                                                    System.out.println("{P:" + p + " N:" + n + "}");
                                                    System.out.println("{S:" + s + " T:" + t + "}");
                                                    System.out.println("{H:" + h + " Y:" + y + "}");
                                                    System.out.println("");
                                                    //break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
