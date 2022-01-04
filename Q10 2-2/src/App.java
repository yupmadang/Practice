public class App {
    static final int VMAX = 21;

    String name;
    int height;
    double vision;

    static class PhyscData{

        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision){ /*������*/
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double avsHeight(PhyscData[] dat){ /*��� Ű�� ���ϴ� �޼���*/
        int sum = 0;

        for(int i = 0; i < dat.length; i++){
            sum += dat[i].height;
        }

        return sum / dat.length;
    }

    static void distVision(PhyscData[] dat, int[] dist){ /*�÷� ������ ��Ÿ���� �޼���*/
        int i = 0;
        dist[i] = 0;
        for(i = 0; i < dat.length; i++){
            if(dat[i].vision >= 0 && dat[i].vision <= VMAX / 10.0){
                dist[(int)(dat[i].vision * 10)]++;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        PhyscData[] x = {
            new PhyscData("������1", 171, 0.5),
            new PhyscData("������2", 172, 0.1),
            new PhyscData("������3", 173, 2.0),
            new PhyscData("������4", 174, 1.5),
            new PhyscData("������5", 175, 0.4),
            new PhyscData("������6", 176, 0.3),
            new PhyscData("������7", 177, 0.6),
        };
        int[] vdist = new int [VMAX];

        System.out.println("��ü ����");
        System.out.println("�̸�      Ű   �÷�");
        System.out.println("-------------------");
        for(int i = 0; i < x.length; i++){
            System.out.printf("%-8s%3d%5.1f\n",x[i].name,x[i].height,x[i].vision);
        }
        System.out.printf("\n��� Ű: %5.1fcm\n", avsHeight(x));

        distVision(x, vdist);

        System.out.println("�÷� ����");
        for (int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~��", i / 10.0); /*������ �޸� ��� �� ��� *�� �׷����� ǥ��*/
			for (int j = 0; j < vdist[i]; j++)
				System.out.print('*');
			System.out.println();
		}
    }
}
