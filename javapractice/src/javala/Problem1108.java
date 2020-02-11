class Solution {
    public String defangIPaddr(String address) {

        StringBuilder addressSb = new StringBuilder();

        for (int i = 0; i < address.length(); i++)
        {
            if (address.charAt(i) != '.')
                addressSb.append(address.charAt(i));
            else
                addressSb.append("[.]");
        }

        return addressSb.toString();
    }
}