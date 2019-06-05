package com.haothink.sequence;

import java.util.Arrays;

/**
 * �۰��������
 * ǰ�᣺���Ѿ��ź�������н����۰����
 * �㷨�����������۰�������򣬿��Լ��ٹؼ��ֵıȽϴ�����
 * ÿ����һ��Ԫ�أ���Ҫ�ȽϵĴ������Ϊ�۰��ж�������ȣ�
 * ������i��Ԫ��ʱ�������log2i�αȽϣ���˲���n-1
 * ��Ԫ�ص�ƽ���ؼ��ֱȽϴ���Ϊnlog2n����n�ϴ�ʱ�۰�
 * ��������ıȽϴ����ֱ�Ӳ������������Ҫ�úܶ࣬��
 * ����������Ҫ�
 * 3.1 �ռ临�Ӷȣ����ϴ��룬ʹ����һ��������Ԫkey���ռ临�Ӷ�ΪO(1)
 * 3.2 ʱ�临�Ӷȣ���Ȼ�۰���Ҽ����˼�¼�Ƚϴ�������û�м����ƶ����������ʱ�临�Ӷ�ֱͬ�Ӳ����㷨��
   3.2.1 ��������ʱ�临�Ӷ�O(n)(���뵽�������)
   3.2.2 ������ʱ�临�Ӷ�O(n^2)
   3.2.3 ƽ��ʱ�临�Ӷȣ�O(n^2)
   3.3 �ȶ��ԣ��ȶ�(ԭ����Ԫ�ص�λ����Բ���)
 * 
 * */
public class BinaryInsertion {

	public static void main(String[] args) {
		int[] nums = new int[]{12,15,23,33,45,0};
		int ele = 13;
		int[] newnums = binaryInsert(nums, ele);

		System.out.println(Arrays.toString(newnums));
	}
	//�۰��������
	//�Ȳ��������ƶ�
	public static int[] binaryInsert(int[] nums,int ele){
		int i,low,high,mid=0;
		low=0;
		high=nums.length-1;
		//��Ѱ�Ҳ���㣬���ղ������low
		while(low<=high){
			mid=(low+high)/2;
			if(ele<nums[mid])
				high=mid-1;
			else 
				low=mid+1;
		}
		//��¼��������ƶ�
		for(i=nums.length-1;i>low;i--)
			nums[i] = nums[i-1];
		nums[mid] = ele;

		return nums;
	}

}

