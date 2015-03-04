package net.slidingmenu.tools.c; class f { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/c/f;
a=0;// .super Lnet/slidingmenu/tools/c/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/c/b;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/c/f;);
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/c/f;->c()Lnet/slidingmenu/tools/c/b;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a(Lnet/slidingmenu/tools/c/k;)Lnet/slidingmenu/tools/c/e;
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-super {p0, p1}, Lnet/slidingmenu/tools/c/b;->a(Lnet/slidingmenu/tools/c/k;)Lnet/slidingmenu/tools/c/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/c/e;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Lnet/slidingmenu/tools/c/e;->b(I)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(J)Lnet/slidingmenu/tools/c/f;
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/c/f;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "ft"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     div-long v2, p1, v2
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public b(J)Lnet/slidingmenu/tools/c/f;
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/c/f;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "ts"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v2, 0x3e8
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     div-long v2, p1, v2
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public d()Lnet/slidingmenu/tools/c/f;
a=0;//     .locals 3
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/c/f;->a:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "osv"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     return-object p0
a=0;// .end method
}}
