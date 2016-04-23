//业务操作
abstract class Stream {
    public abstract char read(int number);

    public abstract void seek(int position);

    public abstract void write(char data);

}

//主体类
class FileStream extends Stream {
    //读文件流
    @Override
    public  char read(int number){
        //***********
    }

    //定位文件流
    @Override
    public  void seek(int position){
        //***********
    }

    //写文件流
    @Override
    public  void write(char data){
        //***********
    }

}

class NetworkStream extends Stream {
    //读文件流
    @Override
    public  char read(int number){
        //###########
    }

    //定位文件流
    @Override
    public  void seek(int position){
        //###########
    }

    //写文件流
    @Override
    public  void write(char data){
        //###########
    }
}


class MemoryStream extends Stream {
    //读文件流
    @Override
    public  char read(int number){
        //@@@@@@@@@@@

    }

    //定位文件流
    @Override
    public  void seek(int position){
        //@@@@@@@@@@@
    }

    //写文件流
    @Override
    public  void write(char data){
        //@@@@@@@@@@@
    }
}

//继承：接口协议
abstract class DecroratorStream extends Stream{
    //组合：复用实现
    protected Stream s;// s=new FileStream(); s=new NetworkStream(); s=new MemoryStream();

    protected DecroratorStream(Stream s){
        this.s=s;
    }
}



class CryptoStream extends DecroratorStream  {


    public CryptoStream(Stream s)
    {
        super(s);
    }

    @Override
    public char read(int number) {
        //额外的加密操作...

        //读文件流
        s.read(number);

    }

    @Override
    public void seek(int position) {
        //额外的加密操作...

        //定位文件流
        s.seek(position);

        //额外的加密操作...

    }

    //写内存流
    @Override
    public void write(char data) {
        //额外的加密操作...

        //写文件流
        s.write(data);

        //额外的加密操作...
    }
}




class BufferedStream extends DecroratorStream {
    Stream s;

    public BufferedStream(Stream s)
    {
        super(s);
    }

    //....
}







class Client {

    public static void main(String args[]) {

        //运行时装配

        FileStream fs=new FileStream();

        Stream s1=new CryptoStream( new FileStream());

        Stream s2 = new BufferedStream(new FileStream());

        Stream s3 = new CryptoStream(new BufferedStream(new FileStream()));


    }
}





