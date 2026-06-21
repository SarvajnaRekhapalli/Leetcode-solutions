class DefangingIpAddress {
    public String defangIPaddr(String address) {
        char ch[]=new char[address.length()];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<address.length();i++)
        {
            char c=address.charAt(i);
            if(c=='.')
            {
                sb.append("[.]");
            }
            else
        {
            sb.append(c);
        }
        }
        return sb.toString();
}
public static void main(String args[])
{
    DefangingIpAddress d=new DefangingIpAddress();
    String address="1.1.1.1";
    System.out.println(d.defangIPaddr(address));
}
}