public class Student {//学生类
    private int on;
    private String name;
    private int age;
    private int java;
    private int c_sharp;
    private int html;
    private int sql;
    private int sum;
    private int avg;
    public int getOn() {
        return this.on;
    }
    public void setOn(int on) {
        this.on = on;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getJava() {
        return java;
    }
    public void setJava(int java) {
        this.java = java;
    }
    public int getC_sharp() {
        return c_sharp;
    }
    public void setC_sharp(int c_sharp) {
        this.c_sharp = c_sharp;
    }
    public int getHtml() {
        return html;
    }
    public void setHtml(int html) {
        this.html = html;
    }
    public int getSql() {
        return sql;
    }
    public void setSql(int sql) {
        this.sql = sql;
    }
    public int getSum() {
        return sum;
    }
    public void setSum() {
        this.sum = this.java+this.sql+this.html+this.c_sharp;
    }
    public int getAvg() {
        return avg;
    }
    public void setAvg() {
        this.avg = this.sum/4;
    }
    public String toString() {
        String msg="\t"+this.on+"\t"+this.name+"\t"+this.age+"\t"+this.java+"\t"+this.c_sharp+"\t"+this.html+"\t"+
                this.sql+"\t"+this.sum+"\t"+this.avg;
        return msg;
    }
}