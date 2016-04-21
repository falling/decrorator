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



//扩展操作
class CryptoFileStream extends FileStream {

    @Override
    public char read(int number) {
        //额外的加密操作...

        //读文件流
        super.read(number);

    }

    @Override
    public void seek(int position) {
        //额外的加密操作...

        //定位文件流
        super.seek(position);

        //额外的加密操作...

    }

    //写内存流
    @Override
    public void write(char data) {
        //额外的加密操作...

        //写文件流
        super.write(data);

        //额外的加密操作...
    }
}

class CryptoNetworkStream extends NetworkStream {


    @Override
    public char read(int number) {
        //额外的加密操作...

        //读网络流
        super.read(number);
    }

    @Override
    public void seek(int position) {
        //额外的加密操作...

        //定位网络流
        super.seek(position);

        //额外的加密操作...
    }


    @Override
    public void write(char data) {
        //额外的加密操作...

        //写网络流
        super.write(data);

        //额外的加密操作...
    }
}


class CryptoMemoryStream extends MemoryStream {


    @Override
    public char read(int number) {
        //额外的加密操作...

        //读内存流
        super.read(number);
    }

    @Override
    public void seek(int position) {
        //额外的加密操作...

        //定位内存流
        super.seek(position);

        //额外的加密操作...
    }

    //写内存流
    @Override
    public void write(char data) {
        //额外的加密操作...

        //写内存流
        super.write(data);

        //额外的加密操作...
    }
}


class BufferedFileStream extends FileStream {

}

class BufferedNetworkStream extends NetworkStream {

}

class BufferedMemoryStream extends MemoryStream {

}

class CryptoBufferedFileStream extends FileStream {


    @Override
    public char read(int number) {
        //额外的加密操作...
        //额外的缓冲操作...

        //读文件流
        super.read(number);

        //额外的加密操作...
        //额外的缓冲操作...

    }

    @Override
    public void seek(int position) {
        //额外的加密操作...
        //额外的缓冲操作...
        //定位文件流

        super.seek(position);

        //额外的加密操作...
        //额外的缓冲操作...
    }

    @Override
    public void write(char data) {
        //额外的加密操作...
        //额外的缓冲操作...

        //写文件流
        super.write(data);
        
        //额外的加密操作...
        //额外的缓冲操作...
    }
}


class Client {

    public static void main(String args[]) {

        //编译时装配
        CryptoFileStream fs1 = new CryptoFileStream();

        BufferedFileStream fs2 = new BufferedFileStream();

        CryptoBufferedFileStream fs3 = new CryptoBufferedFileStream();

    }
}





