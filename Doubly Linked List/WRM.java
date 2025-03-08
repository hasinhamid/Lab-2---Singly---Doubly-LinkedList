public class WRM {
    Patient dh;

    //The constructor is already created for you
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient last=dh.prev;
        last.next=new Patient(id, name, age, bloodgroup,dh,last );
        dh.prev=last.next;
        System.out.println("success");
    }

    public void servePatient() {
        if(dh.next.equals(dh)){
            System.out.println("no patient");
            return;
        }
        else{
            Patient served= dh.next;
            Patient nextP=served.next;
            dh.next=nextP;
            nextP.prev=dh;
            System.out.println("serving :");
            served.printDtl();      //code in Patient class
        }
       

    }

    public void showAllPatient() {
        Patient ptr=dh.next;
        int count=1;
        while (!ptr.equals(dh)) {
            System.out.println("Patient :"+count);
            ptr.printDtl();
            count++;
            ptr=ptr.next;
        }
        if(count==1){
            System.out.println("No patient");
        }
    }

    public boolean canDoctorGoHome() {
        if(dh.next.equals(dh)){
            return true;
        }
        return false; 
    }

    public void cancelAll() {
        dh.next=dh;
        dh.prev=dh;
        System.out.println("success");
    }


    public void reverseTheLine() {
        if(dh.next.equals(dh)){
            System.out.println("empty");
            return;
        }
        Patient temp=null;
        Patient curr=dh.next;
        while(curr!=dh){
            temp= curr.next;
            curr.next=curr.prev;
            curr.prev=temp;
            curr=temp;
        }
        temp=curr.next;
        curr.next=curr.prev;
        curr.prev=temp;
        System.out.println("Success");

    }

}