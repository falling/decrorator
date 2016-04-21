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
class CryptoStream extends Stream  {

    //组合：复用实现
    Stream s;// s=new FileStream(); s=new NetworkStream(); s=new MemoryStream();

    public CryptoStream(Stream s)
    {
        this.s=s;
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




class BufferedStream extends Stream {
    Stream s;

    public BufferedStream(Stream s)
    {
        this.s=s;
    }

}







class Client {

    public static void main(String args[]) {

        //运行时装配

        Stream s1=new CryptoStream( new FileStream());

        Stream fs2 = new BufferedStream(new FileStream());

        Stream fs3 = new CryptoStream(new BufferedStream(new FileStream()));


    }
}





