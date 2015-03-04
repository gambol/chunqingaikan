package net.slidingmenu.tools.b.b.g.c; class c { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/b/b/g/c/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Comparator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lnet/slidingmenu/tools/b/b/g/c/a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lnet/slidingmenu/tools/b/b/g/c/a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/b/g/c/c;->a:Lnet/slidingmenu/tools/b/b/g/c/a;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/g/c/c;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/io/File;Ljava/io/File;)I
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p1}, Ljava/io/File;->lastModified()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p2}, Ljava/io/File;->lastModified()J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(LongHi);v2=(LongLo);v3=(LongHi);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;// 
a=0;//     check-cast p1, Ljava/io/File;
a=0;// 
a=0;//     check-cast p2, Ljava/io/File;
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2}, Lnet/slidingmenu/tools/b/b/g/c/c;->a(Ljava/io/File;Ljava/io/File;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
