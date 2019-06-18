## Packageメモ
パッケージの名前は他の人と被らないほうが良いので、組織のドメインを逆にしたものを使うことが推奨されている。  

パッケージのトップレベルにあるクラスについては public か、もしくは何も付けないという指定ができる。  
public はどこからでもアクセスできる。  
何も付けない場合は package private となり、同じパッケージからのみ呼び出すことができる。  

アプリの起点となるクラスは main() があるクラスは、必ず public に指定しておく必要がある。  

### ＜importするクラス＞  
main() は必ず public となる。  
public と何も付けない場合、package private となる。  
private は同じクラスからのみ呼び出せる  
protected にしていると別の package であってもこのクラスのサブクラスからならアクセスできる。  