package net.slidingmenu.tools.b.b.i; class g { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/i/g;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/net/Socket;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/Socket;);
a=0;//     invoke-direct {v0, p2, p3}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/Socket;);
a=0;//     invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/Socket;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
}}
