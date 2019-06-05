package com.haothink.sequence;

import java.util.Arrays;

/**
 * �򵥵�ѡ������
 * �㷨˼�룺��һ������ʱ���ӵ�һ����¼��ʼ��ͨ��n-1�ιؼ��ֱȽϣ���n����¼��ѡ����
 * �ؼ�����С�ļ�¼�����͵�һ����¼����
 * �ڶ������򣬴ӵڶ�����¼��ʼ��ͨ��n-2�ιؼ��ֵıȽϣ���n-1����¼��ѡ���ؼ�����С��
 * ��¼��ڶ�����¼����
 * ʱ�临�Ӷ�Ϊ��O(n^2)
 * �ռ临�Ӷ�������Ϊ��O(2)��ʵ���Խ��������ǰһ��Ԫ�ؿճ���Ϊ�����Ŀռ�
 * */
public class SimSelectSortDemo {
	
	public static void main(String[] args) {
		int[] data = new int[]{49,38,65,97,76,13,27,49,54,04};
		selectSort(data);
		System.out.println("�����Ϊ"+Arrays.toString(data));
	}
		
	public static void selectSort(int[] data){
		//��¼��СԪ�صĽǱ�
		int index = 0;
		//����Ԫ�ص��м�ֵ
		int temp = 0;
		for(int i=0;i<=data.length-1;i++){
			//����ͷ��Ҫ�Ƚϵ�Ԫ�ش洢��x��
			temp = data[i];
			//�洢��һ��Ԫ�صĽǱ�
			index = i;
			for(int j=i;j<=data.length-1;j++){
				//�����Ԫ��С��x�д洢��Ԫ������Ԫ�ش洢��x�м������Ƚ�
				if(temp>data[j]){
					index = j;
					temp=data[index];
				}
			}
			//һ�˱ȽϽ�������С��Ԫ�����i��Ԫ�ؽ���λ��
			data[index] = data[i];
			data[i] = temp;
		}
	}
}
