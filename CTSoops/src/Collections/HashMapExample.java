package Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapExample {
public static void main(String args[])
{
HashMap<String,Integer> hashmap= new HashMap<String,Integer>();
HashMap<String,Integer> hm= new HashMap<String,Integer>();
hashmap.put("hundred", new Integer(100));
hashmap.put("hundred and one",new Integer(101));
hashmap.put("hundred and two",new Integer(102));
hashmap.put("hundred and Four",new Integer(104));
hashmap.put("hundred and Five", new Integer(105));
hm.putAll(hashmap);
System.out.println("hashmap contains"+ hashmap.size()+" key value pairs.");
if(hashmap.containsValue(new Integer(1)))
{
System.out.println("hashmap contains 1 as value");
}else
{
System.out.println("hash,ap does not contains 1 as value"+"value");
}
System.out.println("Retrieving all keys from"+"the HashMap");
Iterator<String> iterator = hashmap.keySet().iterator();
while(iterator.hasNext())
{
System.out.println(iterator.next());
}
System.out.println("Retriving all key values pairs");
Iterator<Map.Entry<String,Integer>>itr=hashmap.entrySet().iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println("Using enhanced for loop");
for(String aKey:hashmap.keySet())
{
Integer aValue = hashmap.get(aKey);
System.out.println(""+aKey+":"+aValue);
}
}
}
