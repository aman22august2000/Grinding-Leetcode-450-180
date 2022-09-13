class Solution {
    private int mask[]={128,64,32,16,8};
    public boolean validUtf8(int[] data) {
        int l=data.length;
        for(int i=0;i<l;i++)
        {
            int curr=data[i];
            int type=getmask(curr);
            if(type==0)
            {
                continue;
            }
            else if(type>1 && i+type<=l)
            {
                while(type-->1)
                {
                    if(getmask(data[++i])!=1)
                        return false;
                }
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public int getmask(int num)
    {
        for(int i=0;i<5;i++)
        {
            if((mask[i] & num)==0)
                return i;
        }
        return -1;
    }
}