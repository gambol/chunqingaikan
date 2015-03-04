package net.slidingmenu.tools.b.b.i; class j { void a() { int a;
a=0;// .class final Lnet/slidingmenu/tools/b/b/i/j;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lorg/apache/http/client/RedirectHandler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lnet/slidingmenu/tools/b/b/i/e;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lnet/slidingmenu/tools/b/b/i/e;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/b/i/j;->a:Lnet/slidingmenu/tools/b/b/i/e;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/i/j;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getLocationURI(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)Ljava/net/URI;
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v1, "location"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v1}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/net/URI;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v1}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/j;->a:Lnet/slidingmenu/tools/b/b/i/e;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/i/e;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/i/j;->a:Lnet/slidingmenu/tools/b/b/i/e;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lnet/slidingmenu/tools/b/b/i/e;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_2
a=0;//     invoke-static {v1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isRedirectRequested(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/StatusLine;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x12d
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/16 v1, 0x12e
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/16 v1, 0x12f
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/16 v1, 0x133
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
