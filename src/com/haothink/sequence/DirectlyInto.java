package com.haothink.sequence;

import java.util.Arrays;

/**
 * ֱ�Ӳ�������
 * T(n)=O(n*n)
 * S(n)=O(1)
 * �������㷨���ȶ��ģ�����Ԫ���Ǵ�ǰ���Ƚϣ�����ǰҪ�Ƚϵ�Ԫ����ǰ��Ԫ����ͬ���嵽��ǰԪ�غ���Ŀ�λ
 * */
public class DirectlyInto {
	
	public static void main(String[] args) {
		int[] nums = new int[]{0,43,21,32,4,12,55};
		sorted(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static int[] sorted(int[] nums){

		for(int i=2;i<=nums.length-1;i++){
			//�Ȱ�Ҫ�Ƚϵ�Ԫ�طŵ������ڵ���
			nums[0] = nums[i];
			int j=i-1;
			//�Ӻ���ǰ�Ƚ�
			while(nums[0]<nums[j]){
					nums[j+1] = nums[j];
				j--;
			}
			//�����С��ǰ���Ԫ���Ǿͽ�������Ԫ�طŵ�ǰ���Ԫ�������ƶ��Ŀռ�
			nums[j+1] = nums[0];
		}
		return nums;

	}
}
