package com.haothink.sequence;

import java.util.Arrays;

/**
 * ��������(���������еĿ���ָһ�ν������������������)
 * ���㷨�ǲ��ȶ�����
 * �㷨˼��:�ȴ�����ѡ��һ����¼key��Ȼ�������д���key��Ԫ���Ƶ���ͷ��С��key��Ԫ���Ƶ�
 * key��ǰͷ���˺�key���������ֱ���м䣬���˳�Ϊһ������Ȼ���ٶ��ֱ�����ظ�������ֱ���ֱ�
 * ���Ȳ�����һΪֹ��
 * ʱ�临�Ӷȣ���ã�O(nlog2n) �Ϊ��O(n^2)
 * �ռ临�Ӷȣ�O(log2n)
 * ���ſռ临�Ӷȷ��������ŵĵݹ��㷨ִ�й��̶�Ӧһ�Ŷ������������������һ����ȫ������
 * �ݹ鹤��վ�Ĵ�С��ݹ���ö���������ȶ�Ӧ��ƽ������¸����ռ�ģ����Ӷ�ΪO(log2n)
 * */
public class QKSortDemo {
	
	public static void main(String[] args) {
		int[] data = new int[]{49,38,65,97,76,13,27,49,54,04};
		quick(data);
		System.out.println("�����Ϊ"+Arrays.toString(data));
	}
	
	public static void quick(int[] numbers)
	{
		if(numbers.length > 0)   //�鿴�����Ƿ�Ϊ��
		{
			quickSort(numbers, 0, numbers.length-1);
		}
	}
	
	public static void quickSort(int[] numbers,int low,int high)
	{
		if(low < high)
		{
			int middle = getMiddle(numbers,low,high); //��numbers�������һ��Ϊ��
			quickSort(numbers, low, middle-1);   //�Ե��ֶα���еݹ�����
			quickSort(numbers, middle+1, high); //�Ը��ֶα���еݹ�����
		}

	}
	public static int getMiddle(int[] numbers, int low,int high)
	{
		int temp = numbers[low]; //����ĵ�һ����Ϊ����
		while(low < high)
		{
			while(low < high && numbers[high] >= temp)
				high--;
			if(low<high){
				numbers[low]=numbers[high];
				low++;
			}
			while(low < high && numbers[low] < temp)
				low++;
			
			if(low<high){
				numbers[high]=numbers[low];
				high--;
			}
		}
		numbers[low] = temp ; //�����¼��β
		return low ; // ���������λ��
	}
	
	
}
