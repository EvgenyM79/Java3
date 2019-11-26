public class ClassUser {

        public String name, fam;

    //@Override
    public boolean equals(ClassUser user) {
        System.out.println(user.name + " - " + user.fam);
        System.out.println(this.name + " - " + this.fam);
        return (this.name.equals(user.name) && this.fam.equals(user.fam));
    }

    public ClassUser(String n, String f){
        this.name = n;
        this.fam = f;
        }

    }
