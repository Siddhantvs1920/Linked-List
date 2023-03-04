package LinkList;

public class MyLinkList {
    Node root;
    public void add(int data) {
        Node obj = new Node(data);
        if (root == null)
            root = obj;
        else {
            Node tempRoot = root;
            while (tempRoot.next != null) {
                tempRoot = tempRoot.next;
            }
            tempRoot.next = obj;
        }
    }
    public String toString()
        {
            String s="[";
            Node tempRoot=root;
            while (tempRoot!=null)
            {
                if (tempRoot.next!=null)
                    s+=tempRoot.data+", ";
                else
                    s+=tempRoot.data;
              //  System.out.print(tempRoot.data+" ");
                tempRoot=tempRoot.next;
            }
            s+="]";
            return s;

        }
        public boolean contains(int data)
        {
            Node tempRoot=root;
            while (tempRoot!=null)
            {
                if (tempRoot.data==data)
                    return true;
                tempRoot=tempRoot.next;
            }
            return false;
        }
        public int indexOf(int data)
        {
            Node tempRoot=root;
            int index=0;
            while (tempRoot!=null)
            {
                if(tempRoot.data==data)
                    return index;
                index++;
                tempRoot=tempRoot.next;
            }
            return -1;
        }
        public int getData(int userIndex)
        {
            if (userIndex<0)
                throw new ArrayIndexOutOfBoundsException();
            Node temproot=root;
            int index=0;

            while (temproot!=null)
            {
                if (index==userIndex)
                    return temproot.data;
                index++;
                temproot=temproot.next;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        public boolean isEmpty()
        {
            if (root==null)
                return true;
            return false;
        }
        public void set(int userIndex,int data)
        {
          if(userIndex<0)
              throw new ArrayIndexOutOfBoundsException();
          Node temproot=root;
          int index=0;
          while (temproot!=null)
          {
              if (index==userIndex) {
                  temproot.data = data;
                  return;
              }
              index++;
              temproot=temproot.next;
          }
          throw new ArrayIndexOutOfBoundsException();
        }

        public int size()
        {
            Node temproot=root;
            int index=0;
            while (temproot!=null)
            {
                index++;
                temproot=temproot.next;
            }
            return index;
        }

        public int lastIndexOf(int userdata)
        {
            Node temproot=root;
            int index=0;
            int lastIndex=-1;
            while (temproot!=null)
            {
                if (temproot.data==userdata)
                    lastIndex=index;
                index++;
                temproot=temproot.next;
            }
            return lastIndex;
        }
        public void remove(int userIndex)
        {
            if (userIndex<0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (userIndex==0)
            {
                root=root.next;
                return;
            }
            Node tempRoot=root;
            int index=0;
            while (tempRoot.next!=null)
            {
                if (index==userIndex-1)
                {
                    tempRoot.next=tempRoot.next.next;
                    return;
                }
                index++;
                tempRoot=tempRoot.next;
            }
            throw new ArrayIndexOutOfBoundsException();

        }
        public void clear()
        {
            root=null;
        }
        public void addAt(int userIndex,int data)
        {
            if (userIndex<0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            Node obj=new Node(data);
            if (userIndex==0)
            {
                obj.next=root;
                root=obj;
            }
            Node tempRoot=root;
            int index=0;
            while (tempRoot!=null)
            {
                if (index==userIndex-1)
                {
                    obj.next=tempRoot.next;
                    tempRoot.next=obj;
                    return;
                }
                index++;
                tempRoot=tempRoot.next;
            }
            throw new ArrayIndexOutOfBoundsException();
        }


}
