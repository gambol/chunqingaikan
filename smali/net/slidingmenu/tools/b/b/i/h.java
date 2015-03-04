package net.slidingmenu.tools.b.b.i; class h { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/i/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public static a(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;I)V
a=0;//     .locals 5
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/net/DatagramSocket;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/DatagramSocket;);
a=0;//     invoke-direct {v0, p3}, Ljava/net/DatagramSocket;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/DatagramSocket;);
a=0;//     invoke-static {p2}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/InetAddress;);
a=0;//     invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Ljava/net/DatagramPacket;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/net/DatagramPacket;);
a=0;//     array-length v4, v2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v3, v2, v4, v1, p3}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/DatagramPacket;);
a=0;//     invoke-virtual {v0, v3}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/DatagramSocket;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
