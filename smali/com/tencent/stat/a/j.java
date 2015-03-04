package com.tencent.stat.a; class j { void a() { int a;
a=0;// .class public Lcom/tencent/stat/a/j;
a=0;// .super Lcom/tencent/stat/a/e;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Ljava/lang/Long;
a=0;// 
a=0;// .field l:Ljava/lang/String;
a=0;// 
a=0;// .field m:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0, p1, p4}, Lcom/tencent/stat/a/e;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/a/j;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/stat/a/j;->a:Ljava/lang/Long;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/tencent/stat/a/j;->m:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/tencent/stat/a/j;->l:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p5, p0, Lcom/tencent/stat/a/j;->a:Ljava/lang/Long;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()Lcom/tencent/stat/a/f;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/a/f;->a:Lcom/tencent/stat/a/f;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/a/f;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lorg/json/JSONObject;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "pi"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/j;->l:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "rf"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/j;->m:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {p1, v0, v1}, Lcom/tencent/stat/common/k;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/a/j;->a:Ljava/lang/Long;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "du"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/tencent/stat/a/j;->a:Ljava/lang/Long;
a=0;// 
a=0;//     invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
